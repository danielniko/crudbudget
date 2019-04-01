package com.danielniko.crudbudget.repository;

import org.springframework.data.repository.CrudRepository;

import com.danielniko.crudbudget.domain.Expense;

public interface ExpenseRepository extends CrudRepository <Expense, Long> {

}
