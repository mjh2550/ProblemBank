package com.problem.bank.mjin.main.maria.repo;

import com.problem.bank.mjin.main.maria.model.Board;
import com.problem.bank.mjin.main.maria.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

    public List<Test> findAll();

}
