import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private final static SessionFactory sessionFactory;
	
	static
	{
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Department.class);
		configuration.addAnnotatedClass(Employee.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder = builder.applySettings(configuration.getProperties());
		sessionFactory = configuration.buildSessionFactory(builder.build());
	}
	/**
	 * 
	 * @return
	 */
	static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
