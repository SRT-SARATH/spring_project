package com.example.connect_2.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.connect_2.Dto.Phone;
import com.example.connect_2.Repository.PhoneRepository;

@Repository
public class PhoneDao {
	@Autowired
	PhoneRepository phoneRepository;
	

	public Phone savephone(Phone phone) {
		return phoneRepository.save(phone);
	}

	public List<Phone> getAllPhone() {
		return phoneRepository.findAll();
	}

}
