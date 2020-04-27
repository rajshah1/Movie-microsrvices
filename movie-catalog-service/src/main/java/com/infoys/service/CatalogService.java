package com.infoys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.infosys.model.Catalogs;
import com.infosys.repository.CatalogRepository;

public class CatalogService implements ICatalogService{
	@Autowired
	public CatalogRepository catRepo;
	@Override
	public List<Catalogs> serchMovieCatalogsById(String UserId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String savetheCatalogList(List<Catalogs> CatList) {
		// TODO Auto-generated method stub
		System.out.println(CatList);
		for (Catalogs cat:CatList) {
			catRepo.saveAndFlush(cat);
		}
		
		return "Saved the detail";
	}
	
}
