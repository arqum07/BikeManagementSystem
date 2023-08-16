package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {

	@Override
	List<Bike> findAll();
}
