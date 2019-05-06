package com.capgemini.jpademo.entity.service;

import com.capgemini.jpademo.entity.Person;

public interface PersonService   {

	Person get(int personId);

	void newPerson(Person person);
	

}
