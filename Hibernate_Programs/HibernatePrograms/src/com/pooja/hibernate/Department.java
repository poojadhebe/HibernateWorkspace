package com.pooja.hibernate;

import javax.persistence.Entity;

@Entity
public class Department {
	private long deptId;
	private String deptName;
	public Department() {
		
	}
	public Department(long deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	/**
	 * @return the deptId
	 */
	public long getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [deptId=").append(deptId).append(", deptName=").append(deptName).append("]");
		return builder.toString();
	}
	

}
