package com.danielniko.crudbudget.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Expense {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;
    private String name;
    private String description;
    private double amount;
    
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category")
    private Category category;
    
    public Expense() {}
    
    public Expense(String name, String description, Long categoryId, double amount, Category category) {
    	this.name = name;
    	this.description = description;
    	this.amount = amount;
    	this.category = category;
    }

	public Long getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(Long expenseId) {
		this.expenseId = expenseId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", name=" + name + ", description=" + description + ", amount="
				+ amount + "]";
	}
	
}
