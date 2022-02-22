package com.problem.bank.mjin.admin.main.controller;

import com.problem.bank.mjin.admin.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {

    final
    MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    ModelAndView mv;

    @GetMapping("")
    public ModelAndView getAdminMain(){

        mv = new ModelAndView("admin/main");

        return mv;
    }

}
