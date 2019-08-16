package com.oneToManyMapping.ForeignKeyAsson;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="Employee_id")
	private int id;
	
	@Column(name="Employee_name")
	private String name;
	
	@OneToMany(mappedBy = "emp")
	private Set<Account> accSet;
	
	
	public Employee() {
	}

	public Employee(String name) {
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


	public Set<Account> getAccSet() {
		return accSet;
	}


	public void setAccSet(Set<Account> accSet) {
		this.accSet = accSet;
	}

}
