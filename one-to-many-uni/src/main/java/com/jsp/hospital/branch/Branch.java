package com.jsp.hospital.branch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String branch_city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch_city() {
		return branch_city;
	}
	public void setBranch_city(String branch_city) {
		this.branch_city = branch_city;
	}

}
