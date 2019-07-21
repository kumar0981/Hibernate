package com.shashank.inheritence.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contract_employee")
@DiscriminatorValue(value="contract_employee")
public class ContractEmployee extends Employee{

	@Column(name="per_hour_pay")
	private int contractPerHours;

	public int getContractPerHours() {
		return contractPerHours;
	}

	public void setContractPerHours(int contractPerHours) {
		this.contractPerHours = contractPerHours;
	}
	
	
}
