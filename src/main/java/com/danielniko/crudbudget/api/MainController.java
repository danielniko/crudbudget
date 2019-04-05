package com.danielniko.crudbudget.api;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
    private final static Logger LOG = Logger.getLogger(MainController.class.getName());
	
    @RequestMapping("/")
    public String index() {
        return "Spring Boot Backend for CRUD Budget Management.";
    }
    
}
