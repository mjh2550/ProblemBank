package com.problem.bank.mjin.admin.test.controller;

import com.problem.bank.mjin.db.maria.model.Test;
import com.problem.bank.mjin.admin.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor //Lombok : final 혹은 @NonNull인 필드 값만 파라미터로 받는 Constructor를 Injection 해줌. (Autowired 역할)
@RequestMapping("/test")
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

   /**
     * 테스트 게시글 전체조회
     * @return
    */
    @GetMapping("f")
    public List<Test> findAllMember() {
        return testService.findAll();
    }


}
