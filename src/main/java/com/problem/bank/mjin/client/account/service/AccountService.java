package com.problem.bank.mjin.client.account.service;

import com.problem.bank.mjin.db.ora.model.Accounts;
import com.problem.bank.mjin.db.ora.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    /*@Autowired
    public AccountService(AccountRepository accountRepository){
        this.accountRepository =accountRepository;
    }*/

    public List<Accounts> findAll(){
        List<Accounts> accountsList = new ArrayList<>();
        accountRepository.findAll().forEach(e -> accountsList.add(e));
        return accountsList;
    }

}
