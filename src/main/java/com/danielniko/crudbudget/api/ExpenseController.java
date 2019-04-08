package com.danielniko.crudbudget.api;

import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielniko.crudbudget.domain.Expense;
import com.danielniko.crudbudget.repository.ExpenseRepository;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    private final static Logger LOG = Logger.getLogger(ExpenseController.class.getName());

	@Autowired
    private ExpenseRepository repository;
	
    @RequestMapping("")
    public Iterable<Expense> getExpenses() {
      return repository.findAll();
    }
    
    @RequestMapping(path = "/{expenseId}")
    public Optional<Expense> getExpenseById(@PathVariable Long expenseId) {
      return repository.findById(expenseId);
    }
    
    @PostMapping(path = "")
    public void addExpense(@RequestBody Expense expense) {
        repository.save(expense);
    }
    
    @PutMapping(path = "")
    public void updateExpense(@RequestBody Expense expense) {
        repository.save(expense);
    }
    
    @DeleteMapping(path = "/{expenseId}")
    public void deleteExpense(@PathVariable Long expenseId) {
        repository.deleteById(expenseId);
    }
}
