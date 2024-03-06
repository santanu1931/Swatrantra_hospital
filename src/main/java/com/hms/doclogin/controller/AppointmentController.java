package com.hms.doclogin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.doclogin.repository.AppointmentRepository;
import com.hms.doctorlogin.entity.Appointment;

@RestController
@RequestMapping("/api/v2")
public class AppointmentController {
	
	AppointmentRepository appointmentRepository;

	public AppointmentController(AppointmentRepository appointmentRepository) {
		super();
		this.appointmentRepository = appointmentRepository;
	}
	@PostMapping("/insert")
	public Appointment createAppointment(@RequestBody Appointment appointment)
	{
		return appointmentRepository.save(appointment);
		
	}

}
