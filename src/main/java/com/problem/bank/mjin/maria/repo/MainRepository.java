package com.problem.bank.mjin.maria.repo;

import com.problem.bank.mjin.maria.model.Contents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainRepository extends JpaRepository<Contents,Integer> {//extends JPARepository<VO이름,ID칼럼명>

    public List<Contents> findAll();

}
