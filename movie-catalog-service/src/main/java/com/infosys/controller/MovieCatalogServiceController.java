package com.infosys.controller;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infosys.model.Catalogs;
import com.infosys.model.Movie;
import com.infosys.model.Rating;
import com.infosys.repository.CatalogRepository;
import com.infoys.service.ICatalogService;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogServiceController {
		@Autowired
		public RestTemplate restTemplete;
		@Autowired(required=false)
		public ICatalogService catlogService;
		@Autowired
		public  CatalogRepository catRepo;
	@GetMapping(value="/{userId}",produces = "application/json")
	public List<Catalogs> getCatalogFromID(@PathVariable("userId") String userId){
		List<String> movieIds=new LinkedList<String>();
		List<Catalogs> catalogType=new LinkedList<Catalogs>();
		movieIds.add("1001");
		
		///System.out.println(movieIds.get(0));	
		for (int i=0;i<movieIds.size();i++) {
				Movie movieObject=restTemplete.getForObject("http://movie-info-service/movies/"+movieIds.get(i), Movie.class);
				Rating ratingObject=restTemplete.getForObject("http://movie-rating-service/rating/"+movieIds.get(i),Rating.class);
				Catalogs  catalog=new Catalogs(movieObject.getMovie_name(),movieObject.getDescription(), ratingObject.getMovie_rating());
				catalogType.add(catalog);
				catRepo.saveAndFlush(catalog);

				
		}
//		Stream.of(catalogType.get(0).toString())
	//	.forEach(System.out::println);
		
		//System.out.println(catalogType.toString());
		//System.out.println("hello");
		//String a=catlogService.savetheCatalogList(catalogType);
		//System.out.println();
		return catalogType;
		
	}
}
