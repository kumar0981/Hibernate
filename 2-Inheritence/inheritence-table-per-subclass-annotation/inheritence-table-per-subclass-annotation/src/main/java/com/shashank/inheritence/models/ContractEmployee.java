package com.shashank.inheritence.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contract_employee3")
@PrimaryKeyJoinColumn(name="emp_id")
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
