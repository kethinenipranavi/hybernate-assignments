package com.capgemini.jpademo.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.jpademo.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer> {


}
