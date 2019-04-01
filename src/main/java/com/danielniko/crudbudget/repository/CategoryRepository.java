package com.danielniko.crudbudget.repository;

import org.springframework.data.repository.CrudRepository;

import com.danielniko.crudbudget.domain.Category;

public interface CategoryRepository extends CrudRepository <Category, Long> {

}
