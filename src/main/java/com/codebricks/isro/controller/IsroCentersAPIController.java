package com.codebricks.isro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebricks.isro.model.Centres;
import com.codebricks.isro.service.IsroAPIHelper;

@RestController
public class IsroCentersAPIController {
	
	@Autowired
	private IsroAPIHelper isroAPIHelper;
	
	@Cacheable("isrocenters")
	@GetMapping(value = "/isro/centers", produces = MediaType.APPLICATION_JSON_VALUE)	
	public Centres getIsroCenters(){
		return isroAPIHelper.getIsroCentersFromAPI();
	}
}
