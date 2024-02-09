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

import com.Technosignia.com.LifeStream.entity.Donar;
import com.Technosignia.com.LifeStream.service.DonerService;

@RestController
public class DonarController {
	DonerService donarService;
	
	@PostMapping("/doner")
	public Donar createDoner(@RequestBody Donar doner) {
		return donarService.createDoner(doner);
	}
	
	@GetMapping("/doner")
	public List<Donar> findAllDoner(){
		return donarService.findAllDoner();
	}
	
	@GetMapping("/doner/{id}")
	public Optional<Donar> findDonerDetailsById(@RequestParam Long id){
		System.out.println(id);
		return donarService.findDonerDetailsById(id);
	}
	
	@DeleteMapping("/doner")
	public String deleteDonerDetailsById(@RequestParam Long id) {
		return donarService.deleteDonerDetailsById(id);
	}
	
	@PutMapping("/doner")
	public Donar updateDonerDetails(@RequestBody Donar doner)
	{
		 return donarService.updateDonerDetails(doner);
	}

}
