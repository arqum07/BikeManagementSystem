package com.example.demo.entity;

import java.util.List;

public class MyResponce {
	
	Booking book;
	List<Bike> bikeList;
	List<Payment> payList;
	
	public MyResponce() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyResponce(Booking book, List<Bike> bikeList, List<Payment> payList) {
		super();
		this.book = book;
		this.bikeList = bikeList;
		this.payList = payList;
	}

	public Booking getBook() {
		return book;
	}
	public void setBook(Booking book) {
		this.book = book;
	}
	public List<Bike> getBikeList() {
		return bikeList;
	}
	public void setBikeList(List<Bike> bikeList) {
		this.bikeList = bikeList;
	}
	
	public List<Payment> getPayList() {
		return payList;
	}

	public void setPayList(List<Payment> payList) {
		this.payList = payList;
	}

	@Override
	public String toString() {
		return "MyResponce [book=" + book + ", bikeList=" + bikeList + ", payList=" + payList + "]";
	}

	

}
