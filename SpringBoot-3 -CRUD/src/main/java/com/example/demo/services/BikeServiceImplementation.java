package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;
@Service
public class BikeServiceImplementation implements BikeService
{

	BikeRepository bkrepo;

	public BikeServiceImplementation(BikeRepository bkrepo) {
		super();
		this.bkrepo = bkrepo;
	}

	@Override
	public String addBike(Bike b) {
		bkrepo.save(b);
		return "Bike is added";
	}

	@Override
	public Bike getBike(String engNo) {
		
		return bkrepo.findById(engNo).get();
	}

	@Override
	public List<Bike> getAllBike() {
		List<Bike> blist=bkrepo.findAll();
		
		return blist;
	}

	@Override
	public String updateBike(Bike b) {
		bkrepo.save(b);
		return "bike object is updated";
	}

	@Override
	public String deleteBike(String engNo) {
		bkrepo.deleteById(engNo);
		return "bike object is deleted";
	}
	
}
