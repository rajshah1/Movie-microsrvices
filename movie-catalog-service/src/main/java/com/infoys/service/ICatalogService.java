package com.infoys.service;

import java.util.List;

import com.infosys.model.Catalogs;

public interface ICatalogService {
	public List<Catalogs> serchMovieCatalogsById(String UserId);
	public String savetheCatalogList(List<Catalogs> CatList);
}
