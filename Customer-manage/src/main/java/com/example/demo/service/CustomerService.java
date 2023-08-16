package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;

@Service
public interface CustomerService {
	
	List<Customer> getAllCustomer();
    List<Customer> addCustomer(Customer c);
	Customer updateCustomer(Integer CustId, Customer c);
	List<Customer>deleteCustomer(Integer CustId);
	Customer getCustomerById(Integer CustId);
	 
}
