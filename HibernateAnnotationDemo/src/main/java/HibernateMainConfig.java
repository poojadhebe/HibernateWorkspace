

public class HibernateMainConfig {

	public static void main(String[] args) {

		Department dept=new Department();
		dept.setDeptId(1);
		dept.setDeptName("Marketing");
		DepartmentRepository deptRepo=DepartmentRepository.getInstance();
		deptRepo.addDepartment(dept);		
		Department dept2=deptRepo.getDeptById(1);
		System.out.println("Department:"+dept2);

		Employee emp=new Employee();
		emp.setEmpid(1000);
		emp.setEmpName("Pooja");
		emp.setSalary(50000);
		emp.setDepartment(dept2);
		EmployeeRepository employeeRepository=EmployeeRepository.getInstance();
		employeeRepository.addEmployee(emp);
		Employee emp2=employeeRepository.getEmployeeById(1000);
		System.out.println("Employee ::"+emp2);
		HibernateUtil.getSessionFactory().close();
	}

}
