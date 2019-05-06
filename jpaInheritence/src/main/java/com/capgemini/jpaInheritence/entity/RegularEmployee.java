package com.capgemini.jpaInheritence.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RegularEmployee")
public class RegularEmployee extends Employee{
	@Column(name="salary")
	private double salary;
	
	@Column(name="bonus")
	private int bonus;

	public RegularEmployee() {
		super();
	}

	public RegularEmployee(int employeeId, String employeeName , double salary , int bonus) {
		super(employeeId,employeeName);
		this.salary = salary;
		this.bonus = bonus;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
	
}
