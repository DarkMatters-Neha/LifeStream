package com.Technosignia.com.LifeStream.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.LifeStream.entity.Seeker;
import com.Technosignia.com.LifeStream.repository.SeekerRepository;

@Service
public class SeekerService {
	@Autowired
	SeekerRepository seekerRepository;

	public Seeker createSeeker(Seeker seeker) {
		
		return seekerRepository.save(seeker);
	}

	public List<Seeker> findAllSeeker() {
		
		return seekerRepository.findAll();
	}

	public Optional<Seeker> findSeekerDetailsById(Long id) {
		
		return seekerRepository.findById(id);
	}

	public Seeker updateSeekerDetails(Seeker seeker) {
		
		return seekerRepository.save(seeker);
	}

}
