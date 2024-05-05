package com.example.connect_2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.connect_2.Dto.Phone;
import com.example.connect_2.Service.PhoneService;

@RestController
public class PhoneController {
	@Autowired
	PhoneService phoneservice;
	
	@PostMapping("/phone")
	public Phone savePhone(@RequestBody Phone phone) {
		return phoneservice.savePhone(phone);
	}

	@GetMapping("/phoneview")
	public List<Phone> getAllPhone() {
		return phoneservice.getAllPhone();
	}
}
