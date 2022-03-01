package com.problem.bank.mjin.admin.main.controller;

import com.problem.bank.mjin.admin.main.service.MainService;
import com.problem.bank.mjin.db.maria.model.Contents;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor  //생성자 순환참조 방지, final 객체를 알아서 생성자에 넣어줌
@RequestMapping("/main")
public class MainController {

    @Autowired
    private MainService mainService;

    ModelAndView mv;

    @GetMapping("")
    public ModelAndView getAdminMain(){

        mv = new ModelAndView("admin/main");
        List<Contents> AllList = mainService.findAllList();
        mv.addObject("AllList",AllList);

        return mv;
    }

    @PostMapping("search.do")
    public List<Contents> getSearchData(@RequestParam Map<String,Object> param,Model model){
        ArrayList<Contents> searchList = mainService.findSearchList(Integer.parseInt(param.get("result").toString()));
        //System.out.println(param.get("result"));
        //model.addAttribute("msg","/ this is the value sent by the server ");
        return searchList;
    }

}
