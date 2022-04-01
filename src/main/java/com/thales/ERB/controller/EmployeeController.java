package com.thales.ERB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.thales.ERB.entity.Employee;
//import com.thales.ERB.entity.Employee;
import com.thales.ERB.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/index")
	public String HellResponse() {
		System.out.println("Hello!");
		return "index";
	}

	@GetMapping("/employee/list")
	public String listEmployees(Model m) {
//		Employee employee = new Employee();
		m.addAttribute("employee", employeeService.getAllEmployees());
		return "employee";
	}
	
	@GetMapping("/employee/new")
	public String createEmployeeForm(Model model) {
		
		// create student object to hold student form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "add_employee";
	
	}
	
	@PostMapping("/employee/list")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employee/list";
	}
}
