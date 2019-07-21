package com.shashank.inheritence.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Regular_Employee")
@DiscriminatorValue(value="regular_employee")
public class RegularEmployee extends Employee{

	@Column(name="salary")
	private int sal;

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
