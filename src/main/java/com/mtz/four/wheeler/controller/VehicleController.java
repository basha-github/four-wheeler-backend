package com.mtz.four.wheeler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.four.wheeler.entity.FourWheeler;
import com.mtz.four.wheeler.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleService vService;

	@PostMapping("/vehile/add")
	public FourWheeler addNewVehicle(@RequestBody FourWheeler vehicle) {
		
		
		return vService.saveNewVehicle(vehicle);
		
		
		
	}
}
