package com.danielniko.crudbudget.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielniko.crudbudget.domain.Category;
import com.danielniko.crudbudget.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
    private CategoryRepository repository;
	
    @RequestMapping("")
    public Iterable<Category> getCategories() {
      return repository.findAll();
    }
}
