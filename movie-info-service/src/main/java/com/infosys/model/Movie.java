package com.infosys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movietype")
public class Movie {
	@Id
	@Column(name="movie_id")
	public String movie_id;
	@Column(name="movie_name")
	public String movie_name;
	@Column(name="desc")
	public String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public Movie(String movie_id, String movie_name,String desc) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.description=desc;
	}
	public Movie() {
		
	}
	
	
	
}
