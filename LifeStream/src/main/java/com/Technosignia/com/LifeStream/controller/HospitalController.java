package com.Technosignia.com.LifeStream.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.com.LifeStream.entity.Hospital;
import com.Technosignia.com.LifeStream.service.HospitalService;

@RestController
public class HospitalController {
	HospitalService hospitalService;
	
	@PostMapping("/hospital")
	public Hospital createHospital(@RequestBody Hospital hospital) {
		return hospitalService.createHospital(hospital);
	}
	
	@GetMapping("/hospital")
	public List<Hospital> findAllHospital(){
	return hospitalService.findAllHospital();
	}
	
	@GetMapping("/hospital/{id}")
	public Optional<Hospital> findHospitalDetailsById(@RequestParam Long id){
		System.out.println(id);
		return hospitalService.findHospitalDetailsById(id);
	}
	
	@DeleteMapping("/hospital")
	public String deleteHospitalDetailsById(@RequestParam Long id) {
		return hospitalService.deleteHospitalDetailsById(id);
	}
	
	@PutMapping("/hospital")
	public Hospital updateHospitalDetails(@RequestBody Hospital hospital)
	{
		 return hospitalService.updateDonerDetails(hospital);
	}

}
