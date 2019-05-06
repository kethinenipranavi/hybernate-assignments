package com.capgemini.jpaonemany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpaonemany.entity.Certificate;
import com.capgemini.jpaonemany.entity.Employee;
import com.capgemini.jpaonemany.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public String addEmployee() {
		Set<Certificate> set = new HashSet<Certificate>();
		Certificate certificate1 = new Certificate(211, "microsoft", "java");
		Certificate certificate2 = new Certificate(212, "SCJD", "java");
		Certificate certificate3 = new Certificate(213, "SCWCD", "java");
		set.add(certificate1);
		set.add(certificate2);
		set.add(certificate3);
		service.add(new Employee(101, "PRANU", set));
		return "Done";
	}
	
	@RequestMapping("/get")
	public Employee getEmployee() {
		return service.getById(101);
		 
	}


}
