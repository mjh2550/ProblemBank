package com.problem.bank.mjin.main.controller;

import com.problem.bank.mjin.main.model.Board;
import com.problem.bank.mjin.main.repo.TestRepository;
import com.problem.bank.mjin.main.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
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
    public List<Board> findAllMember() {
        return testService.findAll();
    }

}
