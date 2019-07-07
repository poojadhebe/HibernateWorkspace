package com.hibernate.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entity.Actor;
import com.hibernate.entity.Movie;
import com.hibernate.entity.PassportDetails;
import com.hibernate.entity.Person;
import com.hibernate.repository.PersonRepository;
import com.hibernate.util.HibernateUtil;

public class OneToManyAndManyToOneMain {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getInstance();
		Session session = sessionFactory.openSession();
		try {
			Set<Actor> actorSet1 = new HashSet<Actor>();
			Movie movie1 = new Movie(100, "Yeh Jawani hai diwani");
			actorSet1.add(new Actor(1, "Ranbir",movie1));
			actorSet1.add(new Actor(2, "Aditya",movie1));
			movie1.setActors(actorSet1);

			Set<Actor> actorSet2 = new HashSet<Actor>();
			Movie movie2 = new Movie(101, "Airlift");
			actorSet2.add(new Actor(3, "Akshay Kumar",movie2));
			movie2.setActors(actorSet2);

			session.getTransaction().begin();
			session.save(movie1);
			session.save(movie2);
			session.getTransaction().commit();

			// Get by id
			Movie fetchedMovie = session.get(Movie.class, 100);
			System.out.println(fetchedMovie + "\n" + fetchedMovie.getActors());

			Actor fetchActors = session.get(Actor.class, 1);
			System.out.println("Actors::"+fetchActors+"\n"+fetchActors.getMovie());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
