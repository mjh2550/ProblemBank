package com.problem.bank.mjin.common.ora.repo;

import com.problem.bank.mjin.common.ora.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Accounts,String> {

    public List<Accounts> findAll();
}
