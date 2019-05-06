package com.capgemini.demotests.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demotests.entity.Person;
import com.capgemini.demotests.entity.service.PersonService;

@RestController
@RequestMapping("/Person")
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
	
	
	@PostMapping("/post")
	public Person get(Person person) {
		return service.newPerson(person);
	}
	

	@RequestMapping("/get")
	public Person getPerson() {
		Person p = service.get(101);
		return p;
	}
	
	
	
}
