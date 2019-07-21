package com.shashank.inheritence.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_table")
@DiscriminatorColumn(name="Emp_Type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="Employee")
public class Employee {

	@Id
	@Column(name="emp_id")
	private int id;
	
	@Column(name="emp_name")
	private String name;
	
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
