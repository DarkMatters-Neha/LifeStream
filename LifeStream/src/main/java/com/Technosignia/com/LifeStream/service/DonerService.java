package com.Technosignia.com.LifeStream.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.LifeStream.entity.Donar;
import com.Technosignia.com.LifeStream.repository.DonerRepository;


@Service
public class DonerService {
	@Autowired
	DonerRepository donerRepository;

	public Donar createDoner(Donar doner) {
		return donerRepository.save(doner);
	}

	public List<Donar> findAllDoner() {
		return donerRepository.findAll();
	}

	public Optional<Donar> findDonerDetailsById(Long id) {
		return donerRepository.findById(id);
	}
	
	public String deleteDonerDetailsById(Long id) {
		donerRepository.deleteById(id);
		return "Doner Deleted Sucessfully!";
	}
	
	public Donar updateDonerDetails(Donar doner) {
		
		return donerRepository.save(doner);
	}



}
