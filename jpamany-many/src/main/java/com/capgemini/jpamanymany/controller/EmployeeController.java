package com.capgemini.jpamanymany.controller;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpamanymany.entity.Employee;
import com.capgemini.jpamanymany.entity.Project;
import com.capgemini.jpamanymany.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@RequestMapping("/")
	public Set<Employee> addEmployee() 
	{
		Set<Project> project = new HashSet<Project>();

		Project project1 = new Project(211, "Java");
		Project project2 = new Project(212, ".Net");
		Project project3 = new Project(213, "Cloud");
		project.add(project1);
		project.add(project2);
		project.add(project3);

		Set<Employee> employee = new HashSet<Employee>();

		employee.add(new Employee(101, "Pranu", project));
		employee.add(new Employee(102, "anu", project));

		service.addNew(employee);
		return employee;

	}

	/*
	 * @RequestMapping("/get") public Employee getEmployee() { return
	 * service.getById(101);
	 * 
	 * }
	 */

}
