package com.Technosignia.com.LifeStream.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.LifeStream.entity.Address;
import com.Technosignia.com.LifeStream.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
		
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}

	public List<Address> findAllAddress() {
		return addressRepository.findAll();
	}

	public Optional<Address> findAddressDetailsById(Long id) {
		return addressRepository.findById(id);
	}

	public String deleteAddressDetailsById(Long id) {
		addressRepository.deleteById(id);
		return "Address Deleted Sucessfully!";
	}

	public Address updateAddress(Address address) {
		return addressRepository.save(address);
	}
}

