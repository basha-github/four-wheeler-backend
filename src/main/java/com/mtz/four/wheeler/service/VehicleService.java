package com.mtz.four.wheeler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtz.four.wheeler.entity.FourWheeler;
import com.mtz.four.wheeler.repo.FourWheelerRepo;

@Service
public class VehicleService {
	
	@Autowired
	FourWheelerRepo vRepo;
	
	

	public FourWheeler saveNewVehicle(FourWheeler vehicle) {
		return vRepo.save(vehicle);
	}

}
