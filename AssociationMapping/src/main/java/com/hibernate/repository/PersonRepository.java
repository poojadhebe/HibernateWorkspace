package com.hibernate.repository;

import org.hibernate.Session;

import com.hibernate.entity.PassportDetails;
import com.hibernate.entity.Person;

public class PersonRepository {

	private Session session;

	public PersonRepository(Session session) {
		super();
		this.session = session;
	}

	public void addPerson(Person p) {
		try {
			session.getTransaction().begin();
			session.save(p);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} 
	}

	public Person getPersonById(int id) {
		Person p = session.load(Person.class, id);
		return p;
	}

	public PassportDetails getPassportById(int id) {
		PassportDetails p = session.load(PassportDetails.class, id);
		return p;
	}
}
