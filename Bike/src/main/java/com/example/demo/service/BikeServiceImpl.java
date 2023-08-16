package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;

@Service
public class BikeServiceImpl implements BikeService {

	@Autowired
	BikeRepository br;

	@Override
	public List<Bike> findAll() {
		// TODO Auto-generated method stub
		List<Bike> b=br.findAll();
		return b;
	}

}
