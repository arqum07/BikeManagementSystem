package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.demo.entity.Booking;
import com.example.demo.repository.BookingRepository;


@Service
public class BookingServiceimpl implements BookingService {
	@Autowired
	BookingRepository br;
	
	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	
	  @Override public List<Booking> addBooking(Booking b)
	  { 
		  // TODO Auto-generated method stub 
		  br.save(b); 
		  return br.findAll(); 
	  }


	@Override
	public Booking updateBooking(Integer bookId, Booking b) {
		
		  Optional<Booking> obj=br.findById(bookId); 
		  Booking b1=obj.get();
		  b1.setBookId(b.getBookId()); 
		  b1.setBookDate(b.getBookDate());
		  b1.setBookPrice(b.getBookPrice());
		  br.save(b1); 
		  return br.findById(b1.getBookId()).get();
		 
	}

	
	@Override
	public List<Booking> deleteBooking(Integer bookId) {
		// TODO Auto-generated method stub
		br.deleteById(bookId);
		return br.findAll();
	}


	@Override
	public Booking getBookingById(Integer bookId) {
		// TODO Auto-generated method stub
		Optional<Booking> blist=br.findById(bookId);
		return blist.get();
	}


	@Override
	public List<Booking> findBookingBycustId(Integer custId) {
		// TODO Auto-generated method stub
		return br.findBookingBycustId(custId);
	}


	


	
	
	  
	
	 
	 
	 /*@Override public List<Booking> deleteBooking(Integer bookId) { // TODO
	 * Auto-generated method stub br.deleteById(bookId); return br.findAll(); }
	 * 
	 * @Override public Booking getBookingById(Integer bookId) { // TODO
	 * Auto-generated method stub Optional<Booking> obj=br.findById(bookId); return
	 * obj.get(); }
	 */
	 

	/*
	 * @Override public List<Booking> getAllBookingOfBike(Integer bId) { // TODO
	 * Auto-generated method stub return br.findAllByBikeId(bId); }
	 */

}
