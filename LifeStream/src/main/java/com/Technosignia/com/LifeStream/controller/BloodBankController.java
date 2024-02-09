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


import com.Technosignia.com.LifeStream.entity.BloodBank;
import com.Technosignia.com.LifeStream.service.BloodBankService;

@RestController
public class BloodBankController {
	BloodBankService bloodbankService;
	
	@PostMapping("/bloodbank")
	public BloodBank createBloodBank(@RequestBody BloodBank bloodbank) {
		return bloodbankService.createBloodBank(bloodbank);
	}
	
	@GetMapping("/bloodbank")
	public List<BloodBank> findAllBloodBank(){
		return bloodbankService.findAllBloodBank();
	}
	
	@GetMapping("/bloodbank/{id}")
	public Optional<BloodBank> findBloodBankDetailsById(@RequestParam Long id){
		System.out.println(id);
		return bloodbankService.findBloodBankDetailsById(id);
	}
	
	@DeleteMapping("/bloodbank")
	public String deleteBloodBankDetailsById(@RequestParam Long id) {
		return bloodbankService.deleteBloodBankDetailsById(id);
	}
	
	@PutMapping("/bloodbank")
	public BloodBank updateBloodBankDetails(@RequestBody BloodBank bloodbank)
	{
		 return bloodbankService.updateBloodBankDetails(bloodbank);
	}

}
