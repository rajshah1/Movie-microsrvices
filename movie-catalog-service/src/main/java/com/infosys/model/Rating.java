package com.infosys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="rating")
public class Rating {
	public Rating(){
		
	}
	public Rating(String movie_id, int movie_rating) {
		super();
		this.movie_id = movie_id;
		this.movie_rating = movie_rating;
	}
	public String getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}
	public int getMovie_rating() {
		return movie_rating;
	}
	public void setMovie_rating(int movie_rating) {
		this.movie_rating = movie_rating;
	}
	@Id
	@Column(name="movie_id")
	public String movie_id;
	@Column(name="rating")
	public int movie_rating;
	
}
