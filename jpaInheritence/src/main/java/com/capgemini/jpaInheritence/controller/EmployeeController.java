package com.capgemini.jpaInheritence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpaInheritence.entity.ContractEmployee;
import com.capgemini.jpaInheritence.entity.Employee;
import com.capgemini.jpaInheritence.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public Employee addEmployee() {

		
		Employee employee = new ContractEmployee(101,"pranu", 2000.0, "two hours");
		service.addNew(employee);
		return employee;
	}

}
