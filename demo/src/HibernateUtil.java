package com.capgemini.hibernate.util;

import org.hibernate.boot.registry.*;


import org.hibernate.boot.*;


import org.hibernate.*;


import javax.persistence.*;

public class HibernateUtil{


	private static SessionFactory factory;



	public static SessionFactory getSessionFactory(){
		if(factory == null) {
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources sources = new MetadataSources(registry);
			Metadata metadata = sources.getMetadataBuilder().build();
			factory = metadata.getSessionFactoryBuilder().build();
		}
	return factory;
	}
	public static void closeSessionFactory(){
		if(factory!=null)
			factory.close();
	}
}