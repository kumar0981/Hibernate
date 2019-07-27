package com.hibernate.compositekey.Model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Employee_table_4")
public class Employee {
	
	
	@EmbeddedId
	private EmployeeId eid;
	
	@Column(name="emp_name")
	private String name;
	
	@Embedded
	private Address address;

	public EmployeeId getEid() {
		return eid;
	}

	public void setEid(EmployeeId eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
