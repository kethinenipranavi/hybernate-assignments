package com.capgemini.jpaoneone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpaoneone.dao.ProfileDao;
import com.capgemini.jpaoneone.entity.Person;
import com.capgemini.jpaoneone.entity.Profile;

@RestController
public class PersonController {
	@Autowired
	private ProfileDao dao;
	
	@RequestMapping("/")
	public String addPerson() {
		Person person = new Person(101, "PRANU", new Profile(211,"java"));
		dao.save(person);
				return "Done";
	}
	
	@RequestMapping("/get")
	public Person getPerson() {
		Person p = dao.findById(101).get();
		return p;
	}

}
