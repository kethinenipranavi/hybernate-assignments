package com.capgemini.jpaonemany.service;

import com.capgemini.jpaonemany.entity.Employee;

public interface EmployeeService {

	void add(Employee employee);

	Employee getById(int id);

}
