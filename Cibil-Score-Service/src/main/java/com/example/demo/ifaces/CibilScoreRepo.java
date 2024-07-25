package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.CibilScore;

import jakarta.transaction.Transactional;

public interface CibilScoreRepo extends JpaRepository<CibilScore, Long> {
	
	CibilScore findByPanNumber(String srchString);
	
	@Query(value = "update CibilScore set score =:revisedScore where panNumber=:pan")
	@Modifying
	@Transactional
	int updateScore(@Param("pan") String pan,@Param("revisedScore") double revisedScore);
	

}
