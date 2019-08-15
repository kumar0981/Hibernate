package com.hibernate._1To1_Mapping.Mapping.dto.sharedPrimaryKey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Country_List")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private int id;
	
	@Column(name="country_name")
	private String name;
	
	@OneToOne(mappedBy = "country")
	private Employee employee;
	
	public Country() {
	}
	
	public Country(String name) {
		super();
		this.name = name;
	}

	public Country(int id, String name) {
		super();
		this.id = id;
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

	
}
