package com.hibernate.compositekey.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeId implements Serializable{

	@Column(name="EMPLOYEE_ID")
	private Integer emp_id;
	
	@Column(name="DEPARTMENT_NAME")
	private String department;

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public int hashCode(){
		
		Integer randomNumber=9;
		Integer result = 9;
		
		result= randomNumber  * result +  department== null ? 0 : department.hashCode() ;
		result= result + emp_id.hashCode();
		
		return result;
				
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(this==obj){
			return true;
		}
		
		if(getClass()!=obj.getClass()){
			return false;
		}
		
		if(obj==null){
			return false;
		}
		
		EmployeeId eid =(EmployeeId) obj;
		if(department==null){
			if(eid!=null){
				return false;
			}
		}else if(department!=eid.department){
			return false;
		}
		
		if(emp_id!=eid.emp_id){
			return false;
		}
		
		return true;
	}
	
}
