package com.capgemini.jpamanymany.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "Employee_ID")
	private int employeeId;
	@Column(name = "Employee_NAME")
	private String employeeName;

	 @ManyToMany(cascade = CascadeType.ALL)	@JoinTable(name="Employee_PROJECT", joinColumns={@JoinColumn(name="Employee_ID")}, 
    inverseJoinColumns={@JoinColumn(name="PROJECT_ID")})
	private Set<Project> project = new HashSet<>();
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	

	public Employee(int employeeId, String employeeName, Set<Project> project) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.project = project;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}


	
}
