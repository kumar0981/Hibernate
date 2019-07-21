package com.shashank.inheritence.models;

import javax.persistence.*;

@Entity
@Table(name="Employee_table3")
@Inheritance(strategy=InheritanceType.JOINED)  
public class Employee {

	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy=GenerationType.TABLE)
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
