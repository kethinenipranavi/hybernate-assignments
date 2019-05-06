package com.capgemini.jpademo.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpademo.entity.Person;
import com.capgemini.jpademo.entity.dao.PersonDao;


@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao dao;

	@Override
	public Person get(int personId) {
	return dao.findById(personId).get();
		
	}

	@Override
	public void newPerson(Person person) {
		dao.save(person);
	}

}
