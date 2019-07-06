package com.pooja.hibernate;

import javax.persistence.Entity;

@Entity
public class Employee {
	private long id;
	private String firstName;
	private double salary;
	private Department department;
	public Employee() {
		
	}
	
	public Employee(long id, String firstName, double salary, Department department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.salary = salary;
		this.department = department;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", firstName=").append(firstName).append(", salary=")
				.append(salary).append(", department=").append(department).append("]");
		return builder.toString();
	}
	
}
