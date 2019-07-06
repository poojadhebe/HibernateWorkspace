package com.pooja.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernateConfigurations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction();
//		Department dept=new Department(10,"Sales");
//		session.save(dept);
//		session.save(new Employee(100,"Pooja",50000,dept));
//		session.getTransaction().commit();
//		System.out.println("Department added successfully");
//		System.out.println("Employee added successfully");
		/*Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> empList=criteria.list();
		System.out.println(empList);*/
		Employee emp=session.get(Employee.class, new Long(3));
		System.out.println("Employee:\n"+emp);
		}
		catch(Exception ex) {
			//session.getTransaction().rollback();
			ex.printStackTrace();
		}finally {			
			session.close();
		}

	}

}
