package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	@Id
	private int pincode;
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pincode, String city, String country) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
