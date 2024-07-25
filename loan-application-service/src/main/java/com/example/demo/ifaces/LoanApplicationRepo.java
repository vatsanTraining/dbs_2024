package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LoanApplication;

public interface LoanApplicationRepo extends JpaRepository<LoanApplication, Long> {

}
