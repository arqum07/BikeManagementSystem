package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.service.BikeService;

@RestController
@RequestMapping("api/v1/Bike")
public class BikeController {
	@Autowired
	BikeService bs;
	
	 @PostMapping(value = "/addBike",consumes = "application/json")
	  public ResponseEntity<List> addBike(@RequestBody Bike b)
	  { 
		
		  List<Bike> blist = bs.addBike(b); 
		  return new ResponseEntity<List>(blist,HttpStatus.CREATED);	  
	  }
	 
	
	@GetMapping("/getAllBike")
	public List<Bike> getAllBike(){
		List<Bike> blist=bs.getAllBike();
		return blist;
		
	}
	
	@PutMapping(value = "/update/{bikeId}", consumes = "application/json")
	public ResponseEntity<Bike> updateBike(@PathVariable Integer bikeId,@RequestBody Bike b)
	{
		
		
		Bike blist=bs.updateBike(bikeId, b);
		return new ResponseEntity<Bike>(blist,HttpStatus.OK);
		
	}
	
	@DeleteMapping(value = "/delete/{bikeId}")
	public ResponseEntity<List<Bike>> deleteBike(@PathVariable Integer bikeId)
	{
		List<Bike> blist=bs.deleteBike(bikeId);
		return new ResponseEntity<List<Bike>>(blist, HttpStatus.OK);
	}
	//http://localhost:8080/api/v1/Bike/getByBikeId/0
	@GetMapping(value = "/getByBikeId/{bikeId}")
	public ResponseEntity<Bike> getByBikeId(@PathVariable Integer bikeId)
	{
		Bike blist=bs.getBikeById(bikeId);
		return new ResponseEntity<Bike>(blist, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getBikeDetailsByBookId/{bookId}")
	public List<Bike> getbikeDetailsBybookId(@PathVariable Integer bookId) {
		List<Bike> blist = bs.findBikeBybookId(bookId);
		return blist;
	}
	
	@GetMapping(value = "/getBikeDetailsBycustId/{custId}")
	public List<Bike> getBikedetailsbycustID(@PathVariable Integer custId)
	{
		List<Bike> blist=bs.findBikeBycustId(custId);
		return blist;
		
	}

}
