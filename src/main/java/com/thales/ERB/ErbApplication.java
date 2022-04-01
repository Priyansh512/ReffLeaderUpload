package com.thales.ERB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thales.ERB.entity.Employee;
import com.thales.ERB.repo.EmployeeRepository;

@SpringBootApplication
public class ErbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ErbApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Employee emp1 = new Employee("T0123","Priyesh Pandey");
		employeeRepository.save(emp1);
		Employee emp2 = new Employee("T0456", "Sanjay Mishra");
		employeeRepository.save(emp2);
		Employee emp3 = new Employee("T0678", "Ishan");
		employeeRepository.save(emp3);
		
		
		
		
	}
	
}
