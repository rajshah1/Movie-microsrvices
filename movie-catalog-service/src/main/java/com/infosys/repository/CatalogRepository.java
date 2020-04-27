package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.model.Catalogs;

public interface CatalogRepository extends JpaRepository<Catalogs,String>{

}
