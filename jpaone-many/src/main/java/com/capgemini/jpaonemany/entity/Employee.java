package com.capgemini.jpaonemany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	private int employeeId;
	private String employeeName;

	@OneToMany(cascade = CascadeType.ALL)

	private Set<Certificate> certificate;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, Set<Certificate> certificate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.certificate = certificate;
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

	public Set<Certificate> getCertificate() {
		return certificate;
	}

	public void setCertificate(Set<Certificate> certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", certificate="
				+ certificate + "]";
	}

}
