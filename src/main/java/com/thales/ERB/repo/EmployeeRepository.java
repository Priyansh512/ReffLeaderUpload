package com.thales.ERB.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thales.ERB.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}