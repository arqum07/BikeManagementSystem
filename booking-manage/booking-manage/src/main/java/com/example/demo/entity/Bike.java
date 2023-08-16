package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	@Column
	private int bikeId;
	
	@Column(length = 20)
	private String bikeName;
	
	@Column
	private float price;
	@Column
	private int bookId;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Bike(int bikeId, String bikeName, float price, int bookId) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.price = price;
		this.bookId = bookId;
	}



	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + ", price=" + price + ", bookId=" + bookId + "]";
	}




}
