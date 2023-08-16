package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Bike;
import com.example.demo.entity.Booking;
import com.example.demo.entity.Customer;
import com.example.demo.entity.MyResponce;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	@Autowired
	CustomerService cs;
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public ResponseEntity<List> addCustomer(@RequestBody Customer c)
	{
		List<Customer> clist=cs.addCustomer(c);
		return new ResponseEntity<List>(clist, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAllCustomer")
	public List<Customer> getAllCustomer()
	{
		List<Customer> clist=cs.getAllCustomer();
		return clist;
	}
	
	@PutMapping(value = "/update/{custId}", consumes = "application/json")

    public ResponseEntity<Customer> updateCustomer(@PathVariable Integer custId,@RequestBody Customer c)

    {

		Customer clist=cs.updateCustomer(custId, c);

        return new ResponseEntity<Customer>(clist,HttpStatus.OK);

    }

    

    @DeleteMapping(value = "/delete/{custId}", consumes = "application/json")

    public ResponseEntity<List<Customer>> deleteBooking(@PathVariable Integer custId)

    {

        List<Customer> clist=cs.deleteCustomer(custId);

        return new ResponseEntity<List<Customer>>(clist, HttpStatus.OK);

    }

    

    @GetMapping(value = "/getByBookId/{custId}", consumes = "application/json")

    public ResponseEntity<Customer> getByCustomerId(@PathVariable Integer custId)

    {
    	Customer clist=cs.getCustomerById(custId);
        return new ResponseEntity<Customer>(clist, HttpStatus.OK);
    }
    
    @GetMapping("/customerwithBike/{custId}")
	public ResponseEntity<MyResponce> getcustomerWithBike(@PathVariable int custId)
	{
		MyResponce requiredResponce = new MyResponce();
		Customer cust = cs.getCustomerById(custId);
		requiredResponce.setCust(cust);
		List<Bike> listOfBike = restTemplate.getForObject("http://bike-service/api/v1/Bike/getBikeDetailsBycustId/" + custId, List.class);
		requiredResponce.setBikeList(listOfBike);
		return new ResponseEntity<MyResponce>(requiredResponce, HttpStatus.OK);
	}
    
    @GetMapping(value = "/getCustomerwithBooking/{custId}")
    public ResponseEntity<MyResponce> getcustomerwithbooking(@PathVariable Integer custId)
    {
    	MyResponce requiredResponce = new MyResponce();
		Customer cust = cs.getCustomerById(custId);
		requiredResponce.setCust(cust);
		List<Booking> listOfbooking = restTemplate.getForObject("http://booking-service/api/v1/Booking/getBookingBycustId/" + custId, List.class);
		requiredResponce.setBookList(listOfbooking);
		return new ResponseEntity<MyResponce>(requiredResponce, HttpStatus.OK);
	}

}
