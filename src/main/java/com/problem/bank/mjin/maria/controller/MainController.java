package com.problem.bank.mjin.maria.controller;

import com.problem.bank.mjin.maria.service.MainService;
import com.problem.bank.mjin.maria.model.Contents;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

}
