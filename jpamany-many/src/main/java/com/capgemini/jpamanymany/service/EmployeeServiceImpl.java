package com.capgemini.jpamanymany.service;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpamanymany.dao.EmployeeDao;
import com.capgemini.jpamanymany.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao dao;

	/*
	 * @Override public void add(Employee employee) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public Employee getById(int id) { // TODO Auto-generated method
	 * stub return null; }
	 */
	@Override
	public Set<Employee> addNew(Set<Employee> employee) {
		dao.saveAll(employee);
		return employee;
	}


}
