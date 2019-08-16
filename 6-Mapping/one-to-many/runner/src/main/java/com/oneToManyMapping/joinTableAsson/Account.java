package com.oneToManyMapping.joinTableAsson;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String name) {
		super();
		this.name = name;
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
	
	
	
}
