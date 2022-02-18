package com.problem.bank.mjin.main.repo;

import com.problem.bank.mjin.main.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Board, Long> {

    public List<Board> findAll();

}
