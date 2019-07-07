package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Actor;
import com.hibernate.entity.Movie;
import com.hibernate.entity.PassportDetails;
import com.hibernate.entity.Person;


public class HibernateUtil {

	private final static SessionFactory sessionFactory;
	private HibernateUtil()
	{
		
	}
	static
	{
		Configuration configure=new Configuration().configure();
		configure.addAnnotatedClass(Person.class);
		configure.addAnnotatedClass(PassportDetails.class);
		configure.addAnnotatedClass(Actor.class);
		configure.addAnnotatedClass(Movie.class);
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder=builder.applySettings(configure.getProperties());
		sessionFactory= configure.buildSessionFactory(builder.build());
	}
	public static SessionFactory getInstance() {
		return sessionFactory;
	}
	
}
