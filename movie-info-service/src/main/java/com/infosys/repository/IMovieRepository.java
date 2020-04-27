package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.model.Movie;
@Repository
public interface IMovieRepository extends JpaRepository<Movie,String> {

}
