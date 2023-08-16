package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;


@Service
public interface BikeService {
	 List<Bike> getAllBike();
	 List<Bike> addBike(Bike b);
	 Bike updateBike(Integer bikeId, Bike b);
	 List<Bike>deleteBike(Integer bikeId);
	 Bike getBikeById(Integer bikeId);
	 List<Bike> findBikeBybookId(Integer bookId);
	 List<Bike> findBikeBycustId(Integer custId);

}
