package com.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Passport_Details")
public class PassportDetails {

	@Id
	@Column(name = "Passport_ID")
	private int passportId;

	@Column(name = "city")
	private String city;

	@OneToOne(mappedBy = "passportDetails", cascade = CascadeType.ALL)
	Person person;

	public PassportDetails() {
		super();
	}

	public PassportDetails(int passportId, String city) {
		super();
		this.passportId = passportId;
		this.city = city;
	}

	/**
	 * @return the passportId
	 */
	public int getPassportId() {
		return passportId;
	}

	/**
	 * @param passportId
	 *            the passportId to set
	 */
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person
	 *            the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PassportDetails [passportId=").append(passportId).append(", city=").append(city).append("]");
		return builder.toString();
	}

}
