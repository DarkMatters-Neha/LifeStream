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

import com.Technosignia.com.LifeStream.entity.Patient;
import com.Technosignia.com.LifeStream.service.PatientService;


@RestController
public class PatientController {
	PatientService patientService;

	@PostMapping("/patient")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientService.createPatient(patient);
	}
	
	@GetMapping("/patient")
	public List<Patient> findAllHospital(){
		return patientService.findAllHospital();
	}
	
	@GetMapping("patient/{id}")
	public Optional<Patient> findPatientDetailsById(@RequestParam Long id){
		System.out.println(id);
		return patientService.findPatientDetailsById(id);
	}
	
	@DeleteMapping("/patient")
	public String deletePatientDetailsById(@RequestParam Long id) {
		return patientService.deletePatientDetailsById(id);
	}
	
	@PutMapping("/patient")
	public Patient updatePatientDetails(@RequestBody Patient patient)
	{
		return patientService.updatePatientDetails(patient);
	}
}
