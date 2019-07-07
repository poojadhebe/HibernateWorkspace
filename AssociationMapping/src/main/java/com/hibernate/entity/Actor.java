package com.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Actor {

	@Id
	private int actorId;

	@Column
	private String actorName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "movieId")
	Movie movie;

	public Actor(int actorId, String actorName, Movie m) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
		this.movie=m;
	}

	/**
	 * @return the actorId
	 */
	public int getActorId() {
		return actorId;
	}

	/**
	 * @param actorId
	 *            the actorId to set
	 */
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	/**
	 * @return the actorName
	 */
	public String getActorName() {
		return actorName;
	}

	/**
	 * @param actorName
	 *            the actorName to set
	 */
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * @param movie
	 *            the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Actor [actorId=").append(actorId).append(", actorName=").append(actorName).append("]");
		return builder.toString();
	}

}
