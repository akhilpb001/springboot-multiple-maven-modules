package com.example.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Hotel;
import com.example.persistence.HotelRepository;

@RestController
@RequestMapping("/api/v1")
public class HotelController {

	private HotelRepository hotelRepository;

	public HotelController(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@GetMapping("/hotels")
	public List<Hotel> getHotels() {
		return this.hotelRepository.findAll();
	}
}
