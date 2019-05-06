package com.capgemini.hibernate.test;

import com.capgemini.hibernate.dao.*;
import com.capgemini.hibernate.dao.impl.*;
import com.capgemini.hibernate.model.*;

public class Main{
	
	public static void main(String args[]){

		PersonDao person = new PersonDaoImpl();
		person.addNew(new Person(101,"Pranu"));
		System.out.println("Working");
	}
}