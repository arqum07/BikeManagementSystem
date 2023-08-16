package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;

@Service
public class BikeServiceImpl implements BikeService {
	@Autowired
	BikeRepository br;
	
	@Override
	public List<Bike> getAllBike() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	@Override
	public List<Bike> addBike(Bike b) {
		// TODO Auto-generated method stub
		br.save(b);
		return br.findAll();
	}

	@Override
	public Bike updateBike(Integer bikeId, Bike b) {
		// TODO Auto-generated method stub
		Optional<Bike> obj=br.findById(bikeId);
		Bike b1=obj.get();
		b1.setBikeId(b.getBikeId());
		b1.setBikeName(b.getBikeName());
		b1.setPrice(b.getPrice());
		br.save(b1);
		return br.findById(b1.getBikeId()).get();
	}

	@Override
	public List<Bike> deleteBike(Integer bikeId) {
		// TODO Auto-generated method stub
		br.deleteById(bikeId);
		return br.findAll();
	}

	@Override
	public Bike getBikeById(Integer bikeId) {
		// TODO Auto-generated method stub
		Optional<Bike> blist=br.findById(bikeId);
		return blist.get();
	}

	@Override
	public List<Bike> findBikeBybookId(Integer bookId) {
		// TODO Auto-generated method stub
		return br.findBikeBybookId(bookId);
	}

	@Override
	public List<Bike> findBikeBycustId(Integer custId) {
		// TODO Auto-generated method stub
		return br.findBikeBycustId(custId);
	}

}
