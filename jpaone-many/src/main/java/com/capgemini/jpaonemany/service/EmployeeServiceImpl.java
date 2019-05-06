package com.capgemini.jpaonemany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpaonemany.dao.EmployeeDao;
import com.capgemini.jpaonemany.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao dao;
	

	@Override
	public void add(Employee employee) {
		dao.save(employee);
	}

	@Override
	public Employee getById(int id) {
		return dao.findById(id).get();
	}

}
