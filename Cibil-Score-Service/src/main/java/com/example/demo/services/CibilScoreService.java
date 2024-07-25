package com.example.demo.services;


import org.springframework.stereotype.Service;

import com.example.demo.entity.CibilScore;
import com.example.demo.ifaces.CibilScoreRepo;

@Service
public class CibilScoreService {

	
	private CibilScoreRepo repo;
	

	public CibilScoreService(CibilScoreRepo repo) {
		super();
		this.repo = repo;
		
	}
	
	public CibilScore save(CibilScore entity) {
		
		return this.repo.save(entity);
	}
	
     public CibilScore  findByPanNumber(String pan) {
		
		return this.repo.findByPanNumber(pan);
	}
	
}
