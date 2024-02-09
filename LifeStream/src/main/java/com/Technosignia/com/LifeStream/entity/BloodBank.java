package com.Technosignia.com.LifeStream.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class BloodBank {
	@Id
	long id;
	String bname;
	@OneToOne
	Address address;
	String email;
	Long conatct;
	@ManyToOne
	Seeker seeker;
	String bloodType;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getConatct() {
		return conatct;
	}
	public void setConatct(long conatct) {
		this.conatct = conatct;
	}
	public Seeker getSeeker() {
		return seeker;
	}
	public void setSeeker(Seeker seeker) {
		this.seeker = seeker;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	
}
