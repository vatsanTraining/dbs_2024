package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CibilScore;

public interface CibilScoreRepo extends JpaRepository<CibilScore, Long> {
	
	CibilScore findByPanNumber(String srchString);
	

}
