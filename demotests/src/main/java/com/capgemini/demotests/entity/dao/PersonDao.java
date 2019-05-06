package com.capgemini.demotests.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.demotests.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer> {


}
