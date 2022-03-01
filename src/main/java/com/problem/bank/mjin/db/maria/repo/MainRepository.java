package com.problem.bank.mjin.db.maria.repo;

import com.problem.bank.mjin.db.maria.model.Contents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface MainRepository extends JpaRepository<Contents,Integer> {//extends JPARepository<VO이름,ID칼럼명>

    List<Contents> findAll();

    @Query(value = "select ct from contents ct where ct.id = :id")
    ArrayList<Contents> findSearchList(@Param(value = "id")int id);
}
