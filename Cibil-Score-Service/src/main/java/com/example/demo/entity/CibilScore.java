package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "cibilscores_2024")
@Entity
public class CibilScore {
	
	@Id
	@Column(name = "id")
	private long id;
	

	@Column(name = "first_name")
    private String firstName;
	
	@Column(name = "pan_number")
	private String panNumber;
	
	@Column(name = "score")
	private long score;

	public CibilScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CibilScore(long id, String firstName, String panNumber, long score) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.panNumber = panNumber;
		this.score = score;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}
	
		
	
}
