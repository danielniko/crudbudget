package com.danielniko.crudbudget.api;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielniko.crudbudget.domain.Expense;
import com.danielniko.crudbudget.repository.ExpenseRepository;

@RestController
public class MainController {
	
    private final static Logger LOG = Logger.getLogger(MainController.class.getName());

	
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
    
    @PostMapping(path = "/expense", consumes = "application/json", produces = "application/json")
    public void addMember(@RequestBody Expense expense) {
    	LOG.info(">>>>>>>>>>>> " + expense);
        repository.save(expense);
    }
}
