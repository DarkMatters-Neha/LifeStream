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


import com.Technosignia.com.LifeStream.entity.Seeker;
import com.Technosignia.com.LifeStream.service.SeekerService;

@RestController
public class SeekerController {
	SeekerService seekerservice;
	
	@PostMapping("/seeker")
	public Seeker createSeeker(@RequestBody Seeker seeker) {
		return seekerservice.createSeeker(seeker);
	}
	
	@GetMapping("/seeker")
	public List<Seeker> findAllSeeker(){
		return seekerservice.findAllSeeker();
	}
	
	@GetMapping("/seeker/{id}")
	public Optional<Seeker> findSeekerDetailsById(@RequestParam Long id) {
		System.out.print(id);
		return seekerservice.findSeekerDetailsById(id);
	}
	
	
	@PutMapping("/seeker")
	public Seeker updateSeekerDetails(@RequestBody Seeker seeker) {
		return seekerservice.updateSeekerDetails(seeker);
	}

}
