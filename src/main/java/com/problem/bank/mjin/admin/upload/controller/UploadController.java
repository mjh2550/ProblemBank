package com.problem.bank.mjin.admin.upload.controller;

import com.problem.bank.mjin.admin.upload.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    UploadService uploadService;

    ModelAndView mv;

    @GetMapping("")
    public ModelAndView getUploadMain(){
        mv = new ModelAndView("upload");

        return mv;
    }

}
