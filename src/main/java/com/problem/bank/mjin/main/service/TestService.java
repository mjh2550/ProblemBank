package com.problem.bank.mjin.main.service;

import com.problem.bank.mjin.main.model.Board;
import com.problem.bank.mjin.main.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<Board> findAll(){
        List<Board> boards = new ArrayList<>();
        testRepository.findAll().forEach(e -> boards.add(e));
        return boards;
    }

}
