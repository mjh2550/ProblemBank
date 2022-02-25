package com.problem.bank.mjin.admin.main.service;

import com.problem.bank.mjin.admin.main.repo.MainRepository;
import com.problem.bank.mjin.common.maria.model.Contents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class MainService implements MainRepository {

    final
    MainRepository mainRepository;

    public MainService(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @Override
    public List<Contents> findAllList() {
        ArrayList<Contents> arrayList = new ArrayList<>();
        mainRepository.findAllList().forEach(e -> arrayList.add(e));
        return arrayList;
    }

    @Override
    public List<Contents> findAll() {
        return null;
    }

    @Override
    public List<Contents> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Contents> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Contents> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Contents entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Contents> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Contents> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Contents> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Contents> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Contents> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Contents> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Contents> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Contents getOne(String s) {
        return null;
    }

    @Override
    public Contents getById(String s) {
        return null;
    }

    @Override
    public <S extends Contents> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Contents> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Contents> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Contents> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Contents> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Contents> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Contents, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
