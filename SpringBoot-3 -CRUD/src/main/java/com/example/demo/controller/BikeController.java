package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.services.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController {
	BikeService bksrv;

	public BikeController(BikeService bksrv) {
		super();
		this.bksrv = bksrv;
	}
	//creating bike object
	@PostMapping
	public String addBike(@RequestBody Bike b) {
		String msg=bksrv.addBike(b);
		return msg;
		
	}
	//fetching specific bike object using pk
	@GetMapping(value = "{engNo}")
	public Bike fetchBike(@PathVariable String engNo) {
		return bksrv.getBike(engNo);
		
	}
	//fetching all the bike objects
	@GetMapping
	public List<Bike> fetchAllBike() {
		List<Bike> blist=bksrv.getAllBike();
		return blist;
		
	}
	//updating bike object
	@PutMapping
	public String updateBike(@RequestBody Bike b) {
		String msg=bksrv.updateBike(b);
		return msg;
		
	}
	//deleting bike object
	@DeleteMapping(value = "{engNo}")
	public String deleteBike(@PathVariable String engNo) {
		String msg=bksrv.deleteBike(engNo);
		return msg;
	}

}
