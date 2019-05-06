package com.capgemini.jpaInheritence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpaInheritence.dao.EmployeeDao;
import com.capgemini.jpaInheritence.entity.Employee;

@Service
public class EmployeeserviceImpl  implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee addNew(Employee employee) 
	{
		dao.save(employee);
		return employee;
	}
}
