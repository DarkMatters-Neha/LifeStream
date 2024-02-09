package com.Technosignia.com.LifeStream.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.LifeStream.entity.BloodBank;
import com.Technosignia.com.LifeStream.repository.BloodBankRepository;


@Service
public class BloodBankService {
	@Autowired
	BloodBankRepository bloodbankRepository;
	
	public BloodBank createBloodBank(BloodBank bloodbank) {
		return bloodbankRepository.save(bloodbank);
	}

	public List<BloodBank> findAllBloodBank() {
		return bloodbankRepository.findAll();
	}

	public Optional<BloodBank> findBloodBankDetailsById(Long id) {
		return bloodbankRepository.findById(id);
	}

	public String deleteBloodBankDetailsById(Long id) {
		bloodbankRepository.deleteById(id);
		return "Blood Bank Deleted Sucessfully!";
	}

	public BloodBank updateBloodBankDetails(BloodBank bloodbank) {

		return bloodbankRepository.save(bloodbank);
	}
}

