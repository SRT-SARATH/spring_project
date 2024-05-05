package com.example.connect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.connect.Dao.TripDao;
import com.example.connect.Dto.Trip;

@Service
public class TripService {
	@Autowired
	TripDao tripdao;

//	storage data
	public Trip saveTrip(Trip trip) {
		return tripdao.saveTripDao(trip);
	}
	
//	view all data
	public List<Trip> getAllTrip(){
		return tripdao.getAllTrip();
	}
	
//	update data
	public Trip updateTrip(Trip trip,int id) {
		return tripdao.updateTrip(trip,id);
	}

//	delete data
//	public Boolean deleteTrip(int id) {
//		boolean isTrue = tripdao.deleteTrip(id);
//	}
}
