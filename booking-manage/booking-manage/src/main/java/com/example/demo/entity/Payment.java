package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {
	@Id
	@Column
	private int payId;
	@Column
	private String payType;
	@Column
	private Date payDate;
	
	@Column
	private int bookId;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Payment(int payId, String payType, Date payDate, int bookId) {
		super();
		this.payId = payId;
		this.payType = payType;
		this.payDate = payDate;
		this.bookId = bookId;
	}

	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Payment [payId=" + payId + ", payType=" + payType + ", payDate=" + payDate + ", bookId=" + bookId + "]";
	}

	
	

}
