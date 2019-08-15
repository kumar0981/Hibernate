package com.hibernate._1To1_Mapping.Mapping.dto.joinTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_List")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int id;
	
	@Column(name = "employee_name")
	private String name;
	
	@OneToOne
	@JoinTable(name = "employee_country",
			   joinColumns = @JoinColumn(name="employee_id"),
			   inverseJoinColumns = @JoinColumn(name="country_id"))
	private Country country;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name, Country country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	
	public Employee(int id, String name, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
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
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	

}
