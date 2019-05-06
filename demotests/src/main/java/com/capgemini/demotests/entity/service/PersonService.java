package com.capgemini.demotests.entity.service;

import com.capgemini.demotests.entity.Person;

public interface PersonService   {

	Person get(int personId);

	Person newPerson(Person person);
	

}
