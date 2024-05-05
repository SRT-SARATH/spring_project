package com.example.connect.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connect.Dto.Trip;

public interface TripRepository extends JpaRepository<Trip ,Integer> {


}
