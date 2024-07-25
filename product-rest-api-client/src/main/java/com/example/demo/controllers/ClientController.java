package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ProductDTO;

@RestController
@RequestMapping(path = "/api/v1/client/products")
public class ClientController {

	
	private RestTemplate template;

	public ClientController(RestTemplate template) {
		super();
		this.template = template;
	}
	
	
	@GetMapping
	public ProductDTO[] getAllProducts(){
		
		return this.template.getForObject("http://PRODUCT-SERVICE-RDBMS/api/v1/products", ProductDTO[].class);
		
	}
}
