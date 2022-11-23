package org.tnsindia.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MNG")
public class Manager extends Employee{
	
	
	private String deptname;

	//getters and setters method
	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public void setEmpID(int empID) {
		// TODO Auto-generated method stub
		
	}
	
	

}