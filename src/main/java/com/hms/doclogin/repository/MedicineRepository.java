package com.hms.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.doctorlogin.entity.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long>{

}
