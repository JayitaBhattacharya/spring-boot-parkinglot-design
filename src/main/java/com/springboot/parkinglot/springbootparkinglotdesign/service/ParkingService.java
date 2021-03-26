package com.springboot.parkinglot.springbootparkinglotdesign.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.parkinglot.springbootparkinglotdesign.model.VehicleDTO;


public interface ParkingService {

	List<VehicleDTO> getAllVehicles();
	String park(VehicleDTO vehicleDTO);
	String unpark(Long id);
	
}
