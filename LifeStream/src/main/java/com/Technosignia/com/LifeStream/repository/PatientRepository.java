package com.Technosignia.com.LifeStream.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Technosignia.com.LifeStream.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>  {

}
