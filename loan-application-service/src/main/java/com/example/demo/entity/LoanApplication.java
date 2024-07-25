package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "loanappliction_2024")
@Entity
public class LoanApplication {
	
	@Id
	@Column(name = "application_number")
	private long applicationNumber;
	

	@Column(name = "applicant_name")
    private String applicantName;
	
	@Column(name = "pan_number")
	private String panNumber;
	
	@Column(name = "loan_amount")
	private double loanAmount;
	
	@Column(name = "loan_status")
	private String loanStatus;

	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanApplication(long applicationNumber, String applicantName, String panNumber, double loanAmount,
			String loanStatus) {
		super();
		this.applicationNumber = applicationNumber;
		this.applicantName = applicantName;
		this.panNumber = panNumber;
		this.loanAmount = loanAmount;
		this.loanStatus = loanStatus;
	}

	public long getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(long applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	@Override
	public String toString() {
		return "LoanApplication [applicationNumber=" + applicationNumber + ", applicantName=" + applicantName
				+ ", panNumber=" + panNumber + ", loanAmount=" + loanAmount + ", loanStatus=" + loanStatus + "]";
	}
	
	
	
}
