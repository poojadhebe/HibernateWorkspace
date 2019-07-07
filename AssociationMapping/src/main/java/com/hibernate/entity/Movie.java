package com.hibernate.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Movie {

	@Id
	private int movieId;

	@Column
	private String movieName;

	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	private Set<Actor> actors;

	public Movie(int movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

	/**
	 * @return the movieId
	 */
	public int getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId
	 *            the movieId to set
	 */
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @param movieName
	 *            the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * @return the actors
	 */
	public Set<Actor> getActors() {
		return actors;
	}

	/**
	 * @param actors
	 *            the actors to set
	 */
	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [movieId=").append(movieId).append(", movieName=").append(movieName).append("]");
		return builder.toString();
	}

}
