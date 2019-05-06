package com.capgemini.jpaSubclassInheritance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpaSubclassInheritance.entity.Employee;
import com.capgemini.jpaSubclassInheritance.entity.RegularEmployee;
import com.capgemini.jpaSubclassInheritance.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public Employee addEmployee()
	{		
		RegularEmployee employee = new RegularEmployee(101, "pranu", 4000, 1000);
		service.addNew(employee);
		
		return employee;
	}
}
