import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DepartmentRepository {

	static DepartmentRepository departmentRepository;

	private DepartmentRepository() {

	}

	public static DepartmentRepository getInstance() {
		if (departmentRepository == null) {
			departmentRepository = new DepartmentRepository();
		}
		return departmentRepository;
	}

	public void addDepartment(Department dept) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(dept);
			session.getTransaction().commit();
			System.out.println("Department added successfully");
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
	}
	public Department getDeptById(int id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Department d=session.get(Department.class, new Integer(id));
		session.close();
		return d;
	}
}
