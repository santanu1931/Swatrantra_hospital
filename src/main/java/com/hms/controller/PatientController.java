package com.hms.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Patient;
import com.hms.repository.PatientRepository;

@RestController
@RequestMapping("/api/v1")
public class PatientController {

	private PatientRepository patientrepository;

	public PatientController(PatientRepository patientrepository) {
		super();
		this.patientrepository = patientrepository;
	}
	
	public Patient createPatient(@RequestBody Patient patient)
	{
		return patientrepository.save(patient);
		
	}
	
}
