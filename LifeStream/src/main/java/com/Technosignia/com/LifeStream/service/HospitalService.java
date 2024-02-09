package com.Technosignia.com.LifeStream.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Technosignia.com.LifeStream.entity.Hospital;
import com.Technosignia.com.LifeStream.repository.HospitalRepository;


@Service
public class HospitalService {
	@Autowired
	HospitalRepository hospitalRepository;
	
	public Hospital createHospital(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}

	public List<Hospital> findAllHospital() {
		return hospitalRepository.findAll();
	}

	public Optional<Hospital> findHospitalDetailsById(Long id) {
		return hospitalRepository.findById(id);
	}

	public String deleteHospitalDetailsById(Long id) {
		hospitalRepository.deleteById(id);
		return "Hospital Deleted Successfully!";
	}

	public Hospital updateDonerDetails(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}

}
