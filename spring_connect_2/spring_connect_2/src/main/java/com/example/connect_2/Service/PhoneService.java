package com.example.connect_2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.connect_2.Dao.PhoneDao;
import com.example.connect_2.Dto.Phone;

@Service
public class PhoneService {
	@Autowired
	PhoneDao phonedao;

	public Phone savePhone(Phone phone) {
		return phonedao.savephone(phone);
	}
	

	public List<Phone> getAllPhone() {
		return phonedao.getAllPhone();
	}


}
