package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@Column
	private int bookId;
	
	@Column
	private Date bookDate;
	
	@Column
	private float bookPrice;
	
	@Column
	private int BikeId;
	
	@Column
	private int custId;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Booking(int bookId, Date bookDate, float bookPrice, int bikeId, int custId) {
		super();
		this.bookId = bookId;
		this.bookDate = bookDate;
		this.bookPrice = bookPrice;
		BikeId = bikeId;
		this.custId = custId;
	}


	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBikeId() {
		return BikeId;
	}

	public void setBikeId(int bikeId) {
		BikeId = bikeId;
	}
	
	
	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	@Override
	public String toString() {
		return "Booking [bookId=" + bookId + ", bookDate=" + bookDate + ", bookPrice=" + bookPrice + ", BikeId="
				+ BikeId + ", custId=" + custId + "]";
	}


	

	

}