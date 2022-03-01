package com.problem.bank.mjin.client.account.contoller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/test")
public class AccountController {

    /*@Autowired
    private AccountService accountService;

    ModelAndView mv;


    @GetMapping("a")
    public List<Accounts> findAllAccount() {
        return accountService.findAll();
    }

    @GetMapping("b")
    public ModelAndView goHome(){
         //mv = new ModelAndView();
        return new ModelAndView("home");
    }
*/
}
