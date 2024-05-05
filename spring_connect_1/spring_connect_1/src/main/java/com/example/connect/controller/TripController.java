package com.example.connect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.connect.Dao.TripDao;
import com.example.connect.Dto.Trip;
import com.example.connect.service.TripService;

@RestController
public class TripController {
	
	@Autowired
	TripService tripservice;
	
//	storage all data
	@PostMapping("/trippost")
	public Trip saveTrip(@RequestBody Trip trip){
		return tripservice.saveTrip(trip);
		
	}
	
//	view data
	@GetMapping("/trip")
	public List<Trip> getAllTrip() {
		return tripservice.getAllTrip();
	}
	
//	update delete data
	@PutMapping("/trip/{id}")
	public Trip updateTrip(@RequestBody Trip trip ,@PathVariable int id) {
		return tripservice.updateTrip(trip, id);
	}
	
//	delete data
//	@DeleteMapping("/trip/{id}")
//	public Boolean deleteTrip(@PathVariable int id) {
//		return tripservice.deleteTrip(id);
//	}
	 
}
