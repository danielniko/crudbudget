package com.danielniko.crudbudget.repository;

import org.springframework.data.repository.CrudRepository;

import com.danielniko.crudbudget.domain.User;

public interface UserRepository extends CrudRepository <User, Long> {

    User findByUsername(String username);

}
