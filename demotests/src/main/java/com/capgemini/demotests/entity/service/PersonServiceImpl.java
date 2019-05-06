package com.capgemini.demotests.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.demotests.entity.Person;
import com.capgemini.demotests.entity.dao.PersonDao;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao dao;

	@Override
	public Person get(int personId) {
	return dao.findById(personId).get();
		
	}

	@Override
	public Person newPerson(Person person) {
		return dao.save(person);
	}

}
