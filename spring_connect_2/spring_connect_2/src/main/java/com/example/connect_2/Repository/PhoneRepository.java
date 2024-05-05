package com.example.connect_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connect_2.Dto.Phone;

public interface PhoneRepository extends  JpaRepository<Phone, Integer> {

}
