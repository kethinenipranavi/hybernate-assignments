package com.capgemini.jpaConcreteInheritence.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ContractEmployee")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
		@AttributeOverride(name = "name", column = @Column(name = "name")) })
public class ContractEmployee extends Employee {

	@Column(name = "payperhour")
	private double payPerHour;

	@Column(name = "contractduration")
	private String contractDuration;

	public ContractEmployee() {
		super();
	}

	public ContractEmployee(int employeeId, String employeeName, double payPerHour, String contractDuration) {
		super(employeeId, employeeName);
		this.payPerHour = payPerHour;
		this.contractDuration = contractDuration;
	}

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", contractDuration=" + contractDuration + "]";
	}

}
