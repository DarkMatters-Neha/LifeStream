package com.Technosignia.com.LifeStream.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Hospital {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	String name;
	
	@ManyToOne
	Donar donar;
	@ManyToOne
	Patient patient;
	@OneToOne
	Address address;
	@ManyToOne
	BloodBank bloodBank;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Donar getDonar() {
		return donar;
	}
	public void setDonar(Donar donar) {
		this.donar = donar;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public BloodBank getBloodBank() {
		return bloodBank;
	}
	public void setBloodBank(BloodBank bloodBank) {
		this.bloodBank = bloodBank;
	}
	
	

}
