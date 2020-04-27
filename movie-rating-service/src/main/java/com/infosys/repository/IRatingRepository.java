package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.model.Rating;

public interface IRatingRepository extends JpaRepository<Rating,String>{

}
