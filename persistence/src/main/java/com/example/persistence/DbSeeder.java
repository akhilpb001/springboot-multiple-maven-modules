package com.example.persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.domain.Hotel;

@Component
public class DbSeeder implements CommandLineRunner {
	private HotelRepository hotelRepository;


	public DbSeeder(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Hotel marriot = new Hotel("Marriot", 5, true);
		Hotel tulips = new Hotel("Golden Tulips", 4, true);
		Hotel ibis = new Hotel("Ibis", 3, false);

		List<Hotel> hotels = new ArrayList<>(Arrays.asList(marriot, tulips, ibis));

		this.hotelRepository.saveAll(hotels);
	}

}
