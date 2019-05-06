package com.capgemini.jpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpademo.entity.Person;
import com.capgemini.jpademo.entity.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService service;

	/*
	 * @RequestMapping("/") public Person addPerson() { Person person = new
	 * Person(101, "PRANU"); service.save(person); return person; }
	 * 
	 * @RequestMapping("/get") public Person getPerson() { Person p =
	 * service.findById(101).get(); return p; }
	 */
	
	
	@RequestMapping("/")
	public String addPerson() {
		Person person = new Person(101, "PRANU");
		service.newPerson(person);
		return "Done";
	}
	

	@RequestMapping("/get")
	public Person getPerson() {
		Person p = service.get(101);
		return p;
	}
	
	
	
}
