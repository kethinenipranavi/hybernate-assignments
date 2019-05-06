package com.capgemini.jpaonemany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "certificate")
public class Certificate {
	@Id
	private int Id;
	private String name;
	private String description;
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(int id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Certificate [Id=" + Id + ", name=" + name + ", description=" + description + ", employee=" + employee
				+ "]";
	}

}
