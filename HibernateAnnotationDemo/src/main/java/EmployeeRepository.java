import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeRepository {

	static EmployeeRepository employeeRepository;
	
	private EmployeeRepository()
	{
		
	}
	public static EmployeeRepository getInstance()
	{
		if(employeeRepository==null) {
			employeeRepository=new EmployeeRepository();
		}
		return employeeRepository;
	}
	public void addEmployee(Employee emp)
	{
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		try
		{
		session.getTransaction().begin();
		session.save(emp);
		session.getTransaction().commit();
		System.out.println("Employee added successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			session.close();
		}
		
	}
	public Employee getEmployeeById(int id) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Employee emp=session.get(Employee.class, new Integer(id));
		return emp;
	}
}
