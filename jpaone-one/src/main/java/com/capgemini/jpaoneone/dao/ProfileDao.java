package com.capgemini.jpaoneone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.jpaoneone.entity.Person;

public interface ProfileDao extends JpaRepository<Person, Integer> {

}
