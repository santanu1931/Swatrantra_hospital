package com.hms.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.doctorlogin.entity.Appointment;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
