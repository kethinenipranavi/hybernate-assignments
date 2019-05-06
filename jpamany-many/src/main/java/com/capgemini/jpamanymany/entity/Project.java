package com.capgemini.jpamanymany.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@Column( name = "PROJECT_ID" )
	private int projectId;
	@Column( name = "PROJECT_NAME" )
	private String projectName;

	@ManyToMany
	private Set<Employee> employee = new HashSet<>();

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public Project(int projectId, String projectName, Set<Employee> employee) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employee = employee;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//public Set<Employee> getEmployee() {
		//return employee;
	//}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + "]";
	}

	

	

}
