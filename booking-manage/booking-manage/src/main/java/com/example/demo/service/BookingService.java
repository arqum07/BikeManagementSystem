package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Booking;
@Service
public interface BookingService {
	List<Booking> getAllBooking();
	 List<Booking> addBooking(Booking b);
	 Booking updateBooking(Integer bookId, Booking b);
	 List<Booking>deleteBooking(Integer bookId);
	 Booking getBookingById(Integer bookId);
	 List<Booking> findBookingBycustId(Integer custId);
	 
	
	 /* Booking updateBooking(Integer bookId, Booking b);
	 *  List<Booking>deleteBooking(Integer bookId);
	 * Booking getBookingById(Integer bookId);
	 * List<Booking> addBooking(Booking b);
	 *  List<Booking> getAllBookingOfBike(Integer BId);
	 */
}
