package com.problem.bank.mjin.maria.service;

import com.problem.bank.mjin.maria.model.Test;
import com.problem.bank.mjin.maria.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    private TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<Test> findAll(){
        List<Test> boards = new ArrayList<>();
        testRepository.findAll().forEach(e -> boards.add(e));
        return boards;
    }
}
