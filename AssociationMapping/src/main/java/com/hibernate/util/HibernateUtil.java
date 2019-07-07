package com.hibernate.util;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {

	static SessionFactory sessionFactory;
	private HibernateUtil()
	{
		
	}
	public static void getInstance() {
		if(sessionFactory == null)
		{
			sessionFactory=new SessionFactory();
		}
		return sessionFactory;
	}
	
}
