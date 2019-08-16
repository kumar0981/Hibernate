package com.oneToManyMapping.ForeignKeyAsson;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Account_table")
public class Account {

	@Id
	@GeneratedValue
	@Column(name="Account_id")
	private int id;

	@Column(name="bank_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee emp;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String name, Employee emp) {
		super();
		this.name = name;
		this.emp = emp;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}
