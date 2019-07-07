package com.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@Column(name="Person_ID")
	int personId;
	
	@Column(name="Person_Name")
	String personName;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passportId")
	PassportDetails passportDetails;
	
	public Person() {
		super();
	}

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [personId=").append(personId).append(", personName=").append(personName).append("]");
		return builder.toString();
	}

	/**
	 * @return the passportDetails
	 */
	public PassportDetails getPassportDetails() {
		return passportDetails;
	}

	/**
	 * @param passportDetails the passportDetails to set
	 */
	public void setPassportDetails(PassportDetails passportDetails) {
		this.passportDetails = passportDetails;
	}
	
	

}
