package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {


	@Id
	private int id;
	private String type;
	private String company;
	private String customerid;




	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Bike( int id, String type, String company, String customerid) {


		this.id = id;
		this.type = type;
		this.company = company;
		this.customerid = customerid;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getCustomerid() {
		return customerid;
	}


	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}


	@Override
	public String toString() {
		return "Bike [ id=" + id + ", type=" + type + ", company=" + company + ", customerid="
				+ customerid + "]";
	}


}
