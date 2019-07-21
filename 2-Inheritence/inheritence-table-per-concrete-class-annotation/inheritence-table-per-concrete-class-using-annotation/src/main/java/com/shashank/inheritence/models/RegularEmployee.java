package com.shashank.inheritence.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Regular_Employee2")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="Regular_Employee2_id")),
	@AttributeOverride(name="name",column=@Column(name="Regular_Employee2_name"))
})
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
