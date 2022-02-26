package com.problem.bank.mjin.maria.controller;

import com.problem.bank.mjin.maria.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/upload")

public class UploadController {

   /* final UploadService uploadService;

    ModelAndView mv;

    public UploadController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @GetMapping("")
    public ModelAndView getUploadMain(){
        mv = new ModelAndView("upload");

        return mv;
    }*/

}
