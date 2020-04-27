package com.infosys.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Rating;
import com.infosys.repository.IRatingRepository;

@RestController
@RequestMapping("/rating")
public class RatingController {
	@Autowired
	public IRatingRepository ratingRepo;
	
	
	@GetMapping(value="/{movieId}",produces= "application/json")
	public Rating getRatingbyId(@PathVariable("movieId") String movieID) {
		Optional<Rating> ratingOfMovie=ratingRepo.findById(movieID);
		if(ratingOfMovie.isPresent()) {
			return ratingOfMovie.get();
		}
		return null;
	}
}
