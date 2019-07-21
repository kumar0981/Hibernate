package com.shashank.inheritence.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Regular_Employee3")
@PrimaryKeyJoinColumn(name="emp_id")
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
