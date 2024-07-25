package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.LoanApplication;
import com.example.demo.ifaces.LoanApplicationRepo;
import com.example.demo.model.CibilScoreDTO;

@Service
public class LoanApplicationService {

	
	private LoanApplicationRepo repo;
private RestTemplate template;

	public LoanApplicationService(LoanApplicationRepo repo,RestTemplate template) {
		super();
		this.repo = repo;
		this.template=template;
	}
	
	public LoanApplication save(LoanApplication entity) {
		
		String url = "http://CIBIL-SCORE-SERVICE/api/v1/scores/"+entity.getPanNumber();
		CibilScoreDTO dto = this.template.getForObject(url, CibilScoreDTO.class);
		
		System.out.println(dto.getScore());
		if(dto.getScore()>600) {
		    entity.setLoanStatus("APPROVED");
		} else {
			entity.setLoanStatus("REJECTED");
		}
		System.out.println(entity.getLoanStatus());
		
		return this.repo.save(entity);
	}
	
     public List<LoanApplication>  findAll() {
		
		return this.repo.findAll();
	}
	
}
