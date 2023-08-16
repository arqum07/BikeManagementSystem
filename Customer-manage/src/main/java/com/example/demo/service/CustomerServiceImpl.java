package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;

import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository cr;
	
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public List<Customer> addCustomer(Customer c) {
		// TODO Auto-generated method stub
		cr.save(c);
		return cr.findAll();
	}

	@Override
	public Customer updateCustomer(Integer CustId, Customer c) {
		// TODO Auto-generated method stub
		Optional<Customer> clist=cr.findById(CustId);
		Customer c1=clist.get();
		c1.setCustId(c.getCustId());
		c1.setCustName(c.getCustName());
		c1.setAddress(c.getAddress());
		cr.save(c1);
		return cr.findById(c1.getCustId()).get();
	}
	
	/*
	 * @Override
	 * public Payment updatePayment(Integer payId, Payment c) { // TODO
	 * Auto-generated method stub 
	 * Optional<Payment> plist=pr.findById(payId);
	 * Payment p1=plist.get();
	 *  p1.setPayId(c.getPayId());
	 * p1.setPayType(c.getPayType());
	 * p1.setPayDate(c.getPayDate()); 
	 * pr.save(p1);
	 * return pr.findById(p1.getPayId()).get(); }
	 * 
	 */
	@Override
	public List<Customer> deleteCustomer(Integer CustId) {
		// TODO Auto-generated method stub
		cr.deleteById(CustId);
		return cr.findAll();
	}

	@Override
	public Customer getCustomerById(Integer CustId) {
		// TODO Auto-generated method stub
		Optional<Customer> clist=cr.findById(CustId);
		return clist.get();
	}

	

}
