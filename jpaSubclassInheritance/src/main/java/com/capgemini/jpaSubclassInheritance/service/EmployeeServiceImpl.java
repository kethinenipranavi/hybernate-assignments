package com.capgemini.jpaSubclassInheritance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpaSubclassInheritance.dao.EmployeeDao;
import com.capgemini.jpaSubclassInheritance.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee addNew(Employee employee) {
		dao.save(employee);
		return employee;
	}

}
