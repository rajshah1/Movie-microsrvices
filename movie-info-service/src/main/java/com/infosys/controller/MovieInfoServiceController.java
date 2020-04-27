package com.infosys.controller;

import java.util.Optional;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.infosys.model.Movie;
import com.infosys.repository.IMovieRepository;

@RestController
@RequestMapping("/movies")
public class MovieInfoServiceController {
	@Autowired
	public IMovieRepository movieRepo;
	
	@GetMapping(value ="/{movieId}",produces = "application/json")
	public Movie getCatalogFromID(@PathVariable("movieId") String movieId){
		Optional<Movie> movieInfo=movieRepo.findById(movieId);
		if(movieInfo.isPresent()) {
			return movieInfo.get();
		}
		System.out.println("This returns Null");
		return null;
	}
}
