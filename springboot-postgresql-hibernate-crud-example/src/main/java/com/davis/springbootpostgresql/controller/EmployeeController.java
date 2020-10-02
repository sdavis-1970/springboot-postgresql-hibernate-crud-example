package com.davis.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.davis.springbootpostgresql.model.Employee;
import com.davis.springbootpostgresql.service.EmployeeService;


	
	
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = {"/", "index"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping("/employees")
	public String getEmployees(Model model) {
		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		return "employee-list";
	}
}
	
