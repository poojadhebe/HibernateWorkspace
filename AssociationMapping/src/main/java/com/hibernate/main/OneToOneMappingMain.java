package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entity.PassportDetails;
import com.hibernate.entity.Person;
import com.hibernate.repository.PersonRepository;
import com.hibernate.util.HibernateUtil;

public class OneToOneMappingMain {

	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getInstance();
		Session session=sessionFactory.openSession();
		try
		{
			Person person=new Person(100,"Pooja");
			PassportDetails passportDetails=new PassportDetails(1000, "Pune");
			person.setPassportDetails(passportDetails);
			PersonRepository personRepository=new PersonRepository(session);
			personRepository.addPerson(person);
			Person fetchedPerson=personRepository.getPersonById(100);
			System.out.println("Person:"+fetchedPerson);
			System.out.println(fetchedPerson.getPassportDetails());
			
			PassportDetails ppd=personRepository.getPassportById(1000);
			System.out.println("PassportDetails:"+ppd);
			System.out.println(ppd.getPerson());
			
		}finally
		{
			session.close();
			sessionFactory.close();
		}
	}

}
