package com.danielniko.crudbudget.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielniko.crudbudget.domain.Expense;
import com.danielniko.crudbudget.repository.ExpenseRepository;

@RestController
public class MainController {
	
	@Autowired
    private ExpenseRepository repository;
	
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/expenses")
    public Iterable<Expense> getExpenses() {
      return repository.findAll();
    }
}
