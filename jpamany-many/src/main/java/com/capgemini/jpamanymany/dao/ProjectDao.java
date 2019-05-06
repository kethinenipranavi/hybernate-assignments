package com.capgemini.jpamanymany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpamanymany.entity.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

}
