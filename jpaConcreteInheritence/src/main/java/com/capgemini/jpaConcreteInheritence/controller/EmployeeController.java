package com.capgemini.jpaConcreteInheritence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpaConcreteInheritence.entity.Employee;
import com.capgemini.jpaConcreteInheritence.entity.RegularEmployee;
import com.capgemini.jpaConcreteInheritence.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public Employee addEmployee()
	{		
		RegularEmployee employee = new RegularEmployee(101, "pranu", 2000.0, 1000);
		service.addNew(employee);
		
		return employee;
	}
}
