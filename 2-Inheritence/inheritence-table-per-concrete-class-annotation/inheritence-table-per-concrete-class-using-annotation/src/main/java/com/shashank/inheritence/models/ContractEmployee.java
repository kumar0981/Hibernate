package com.shashank.inheritence.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contract_employee2")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="contract_employee2_id")),
	@AttributeOverride(name="name",column=@Column(name="contract_employee2_name"))
})
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
