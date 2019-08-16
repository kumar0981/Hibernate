package com.oneToManyMapping.joinTableAsson;

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
	
	@OneToMany
	@JoinTable(name = "Employee_Account_Table",
			joinColumns = @JoinColumn(name="EmployeeTable_id"),
			inverseJoinColumns = @JoinColumn(name="accountTable_id"))
	private Set<Account> accSet;
	
	
	public Employee() {
	}

	public Employee(String name, Set<Account> accSet) {
		super();
		this.name = name;
		this.accSet = accSet;
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
