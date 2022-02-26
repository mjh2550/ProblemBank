package com.problem.bank.mjin.maria.service;

import com.problem.bank.mjin.maria.model.Contents;
import com.problem.bank.mjin.maria.repo.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//@RequiredArgsConstructor  //생성자 순환참조 방지, final 객체를 알아서 생성자에 넣어줌
@Service
public class MainService  {

    private MainRepository mainRepository;

    @Autowired
    public MainService(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public List<Contents> findAllList() {
        List<Contents> List = new ArrayList<>();
        mainRepository.findAll().forEach(e -> List.add(e));

        return List;
    }

}
