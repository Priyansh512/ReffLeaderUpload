package com.thales.ERB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thales.ERB.entity.Employee;
import com.thales.ERB.repo.EmployeeRepository;
import com.thales.ERB.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public void DeleteEmployeebyId(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
