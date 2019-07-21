package com.shashank.inheritence.models;

import javax.persistence.*;

@Entity
@Table(name="Employee_table2")
@MappedSuperclass                      // remove this and see the result
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  
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
