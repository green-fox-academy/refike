package com.greenfoxacademy.sqlreview;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CatRepository extends CrudRepository<Cat,Long> {

    List<Cat> findAllByName(String name);
}
