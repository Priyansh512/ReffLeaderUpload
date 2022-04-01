package com.thales.ERB.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	private String employeeTGI;
	private String employeeName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeTGI, String employeeName) {
		super();
		this.employeeTGI = employeeTGI;
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeTGI() {
		return employeeTGI;
	}

	public void setEmployeeTGI(String employeeTGI) {
		this.employeeTGI = employeeTGI;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
