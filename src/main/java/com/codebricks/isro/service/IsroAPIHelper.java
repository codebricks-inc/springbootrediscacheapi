package com.codebricks.isro.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.codebricks.isro.model.Centres;

@Service
public class IsroAPIHelper {
	
	private static final Logger log = LoggerFactory.getLogger(IsroAPIHelper.class);

	@Value("${api.isro.centers}")
	private String isroAPIEndpoint;
	@Autowired
	private RestTemplate restTemplate;
	
	public Centres getIsroCentersFromAPI(){
		ResponseEntity<Centres> responEntity = restTemplate.exchange(isroAPIEndpoint, HttpMethod.GET, null, Centres.class);
		log.info("Response {}",responEntity);
		return (Centres) responEntity.getBody();		
	}
}
