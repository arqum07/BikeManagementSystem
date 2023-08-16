package com.example.demo.entity;

import java.util.List;

public class MyResponce {
	
	Customer cust;
	List<Bike> bikeList;
	List<Booking> bookList;
	public MyResponce() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MyResponce(Customer cust, List<Bike> bikeList, List<Booking> bookList) {
		super();
		this.cust = cust;
		this.bikeList = bikeList;
		this.bookList = bookList;
	}

	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public List<Bike> getBikeList() {
		return bikeList;
	}
	public void setBikeList(List<Bike> bikeList) {
		this.bikeList = bikeList;
	}
	
	public List<Booking> getBookList() {
		return bookList;
	}

	public void setBookList(List<Booking> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "MyResponce [cust=" + cust + ", bikeList=" + bikeList + ", bookList=" + bookList + "]";
	}

	
}
