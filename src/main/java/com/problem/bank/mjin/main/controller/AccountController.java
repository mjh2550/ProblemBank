package com.problem.bank.mjin.main.controller;

import com.problem.bank.mjin.main.ora.model.Accounts;
import com.problem.bank.mjin.main.ora.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/test")
public class AccountController {

    @Autowired
    private AccountService accountService;


    @GetMapping("a")
    public List<Accounts> findAllAccount() {
        return accountService.findAll();
    }
}
