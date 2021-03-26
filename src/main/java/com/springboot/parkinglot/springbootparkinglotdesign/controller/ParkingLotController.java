package com.springboot.parkinglot.springbootparkinglotdesign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.parkinglot.springbootparkinglotdesign.model.MyIntroduction;
import com.springboot.parkinglot.springbootparkinglotdesign.model.VehicleDTO;
import com.springboot.parkinglot.springbootparkinglotdesign.service.ParkingService;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {
	
	@Autowired
	ParkingService parkingService;
	
	/*
	 * @GetMapping("/aboutMe") public MyIntroduction aboutMe() { return
	 * MyIntroduction.builder().name("Mihir").age(25).skills("Java and Spring boot")
	 * .build(); }
	 * 
	 * @PostMapping("/infoAboutSomeone") public MyIntroduction
	 * infoAboutSomeone(String name, int age, String skills) { return
	 * MyIntroduction.builder().name(name).age(age).skills(skills).build(); }
	 */
	
	@GetMapping("/parkingInfo")
	public List<VehicleDTO> getAllVehicles()
	{
		return parkingService.getAllVehicles();
	}

	@PostMapping("/park")
	public String park(VehicleDTO vehicleDTO)
	{
		return parkingService.park(vehicleDTO);
	}
	
	@DeleteMapping("/unpark")
	public String unpark(Long id)
	{
		return parkingService.unpark(id);
	}
	
}
