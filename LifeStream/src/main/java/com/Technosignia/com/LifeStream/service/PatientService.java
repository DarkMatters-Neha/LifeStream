package com.Technosignia.com.LifeStream.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.LifeStream.entity.Patient;
import com.Technosignia.com.LifeStream.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	PatientRepository patientRepository;
	
	public Patient createPatient(Patient patient) {
		
		return patientRepository.save(patient);
	}

	public List<Patient> findAllHospital() {
		
		return patientRepository.findAll();
	}

	public Optional<Patient> findPatientDetailsById(Long id) {
		
		return patientRepository.findById(id);
	}

	public String deletePatientDetailsById(Long id) {
		
		patientRepository.deleteById(id);
		
		return "Patient Deleted Successfully!";
	}

	public Patient updatePatientDetails(Patient patient) {
		
		return patientRepository.save(patient);
	}

}
