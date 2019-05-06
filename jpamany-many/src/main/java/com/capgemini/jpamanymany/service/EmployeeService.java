package com.capgemini.jpamanymany.service;
import java.util.Set;

import com.capgemini.jpamanymany.entity.Employee;

public interface EmployeeService {

	public Set<Employee> addNew(Set<Employee> employee);

}
