package com.infosys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moviecatalog",schema = "Movie")
public class Catalogs{
	@Id
	@Column(name="`movie_name`")
	public String movieName;
	@Column(name="`desc`")
	public String decreiption;
	@Column(name="`movierating`" ,table="moviecatalog")
	public int rating;
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * @return the decreiption
	 */
	public String getDecreiption() {
		return decreiption;
	}
	/**
	 * @param decreiption the decreiption to set
	 */
	public void setDecreiption(String decreiption) {
		this.decreiption = decreiption;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Catalogs(String movieName, String decreiption, int rating) {
		super();
		this.movieName = movieName;
		this.decreiption = decreiption;
		this.rating = rating;
	}
	public Catalogs() {
		
	}
	
	
	
	
}