package com.springboot.parkinglot.springbootparkinglotdesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.parkinglot.springbootparkinglotdesign.model.VehicleDTO;

@Repository
public interface ParkingRepository extends JpaRepository<VehicleDTO, Long>{

}
