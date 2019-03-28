package com.danielniko.crudbudget.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expense implements Serializable {

	private static final long serialVersionUID = -5706498545977423505L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;
    private String name;
    private String description;
    private Long categoryId;
    private double amount;

    /*
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date regDate;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updDate;
    */
    
    public Expense() {}
    
    public Expense(String name, String description, Long categoryId, double amount) {
    	this.name = name;
    	this.description = description;
    	this.categoryId = categoryId;
    	this.amount = amount;
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

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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
	
	/*
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}
	*/

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", name=" + name + ", description=" + description + ", categoryId="
				+ categoryId + ", amount=" + amount + "]";
	}
    
    
    
    
}
