package com.example.connect.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.connect.Dto.Trip;
import com.example.connect.Repository.TripRepository;

@Repository
public class TripDao {
	@Autowired
	TripRepository triprepository;

//	storage all data
	public Trip saveTripDao(Trip trip) {
		return triprepository.save(trip);
	}

//	get all data
	public List<Trip> getAllTrip() {
		return triprepository.findAll();
	}

	
//	update process
	public Trip updateTrip(Trip trip, int id) {
	 Optional<Trip> tripObj = triprepository.findById(id);
	 Trip tripData = new Trip();	
	 if (tripObj != null) {
		 tripData = triprepository.save(trip);
	 }
	 return tripData;
	}

//	public Boolean deleteTrip(int id) {
//		Optional<Trip> tripobj = triprepository.findById(id);
//		if(tripobj.isPresent()) {
//			triprepository.delete(tripobj.get());
//			return true;	
//		}
//		else return false;
//	}
//}

}


