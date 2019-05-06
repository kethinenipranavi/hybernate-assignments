package com.capgemini.jpamanymany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpamanymany.entity.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
