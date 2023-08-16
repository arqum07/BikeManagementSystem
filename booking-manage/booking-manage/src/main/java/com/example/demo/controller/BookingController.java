package com.example.demo.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
import com.example.demo.entity.MyResponce;
import com.example.demo.entity.Payment;
import com.example.demo.service.BookingService;


//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/Booking")
public class BookingController {
	@Autowired
	BookingService bs;

	@Autowired
	RestTemplate restTemplate;
	
	  @PostMapping(value = "/add",consumes = "application/json")
	  public ResponseEntity<List> addBooking(@RequestBody Booking b)
	  { 
		  List<Booking>blist=bs.addBooking(b); 
		  return new ResponseEntity<List>(blist,HttpStatus.CREATED);
	  
	  }
	 
	
	@GetMapping("/getAll")
	public List<Booking> getAllBooking(){
		List<Booking> blist=bs.getAllBooking();
		return blist;
		
	}
	
	@PutMapping(value = "/update/{bookId}", consumes = "application/json")
	public ResponseEntity<Booking> updateBooking(@PathVariable Integer bookId,@RequestBody Booking b)
	{
		Booking blist=bs.updateBooking(bookId, b);
		return new ResponseEntity<Booking>(blist,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{bookId}", consumes = "application/json")
	public ResponseEntity<List<Booking>> deleteBooking(@PathVariable Integer bookId)
	{
		List<Booking> blist=bs.deleteBooking(bookId);
		return new ResponseEntity<List<Booking>>(blist, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getByBookId/{bookId}", consumes = "application/json")
	public ResponseEntity<Booking> getByBookingId(@PathVariable Integer bookId)
	{
		Booking blist=bs.getBookingById(bookId);
		return new ResponseEntity<Booking>(blist, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getBookingBycustId/{custId}")
	public List<Booking> getBookingBycustId(@PathVariable Integer custId)
	{
		List<Booking> blist=bs.findBookingBycustId(custId);
		return blist;
		
	}
	
	@GetMapping("/bookingwithBike/{bookId}")

	public ResponseEntity<MyResponce> getBookingWithBike(@PathVariable int bookId)

	{

		MyResponce requiredResponce = new MyResponce();

		Booking book = bs.getBookingById(bookId);

		requiredResponce.setBook(book);

		List<Bike> listOfBike = restTemplate.getForObject("http://bike-service/api/v1/Bike/getBikeDetailsByBookId/" + bookId, List.class);

		requiredResponce.setBikeList(listOfBike);

		return new ResponseEntity<MyResponce>(requiredResponce, HttpStatus.OK);

	}
	@GetMapping("/bookingwithPayment/{bookId}")
	public ResponseEntity<MyResponce> getBookingWithPayment(@PathVariable int bookId )
	{
		MyResponce requiredResponce =new MyResponce();
		Booking book=bs.getBookingById(bookId);
		requiredResponce.setBook(book); 
		
		List<Payment> pay = restTemplate.getForObject("http://payment-service/api/v1/payment/getPaymentDetailsBybookId/"+ bookId, List.class);
		requiredResponce.setPayList(pay);
		return new ResponseEntity<MyResponce>(requiredResponce, HttpStatus.OK);
	}
}
