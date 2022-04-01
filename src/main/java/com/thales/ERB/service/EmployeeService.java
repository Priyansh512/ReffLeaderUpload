package com.thales.ERB.service;

import java.util.List;

import com.thales.ERB.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	Employee getEmployeeById(Integer employeeId);
	void DeleteEmployeebyId(Integer employeeId);
	

}
