package com.hms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patients")
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long Id;
@Column(name= "first_name")
private String name;
@Column(name= "age")
private String age;
@Column(name="blood_group")
private String blood;
@Column(name="prescription")
private String  prescription;
@Column(name="dose")
private String dose;
@Column(name="fees")
private String fees;
@Column(name="urgency")
private String urgency;
public Patient(long id, String name, String age, String blood, String prescription, String dose, String fees,
		String urgency) {
	super();
	Id = id;
	this.name = name;
	this.age = age;
	this.blood = blood;
	this.prescription = prescription;
	this.dose = dose;
	this.fees = fees;
	this.urgency = urgency;
}
public Patient() {
	super();
}
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getBlood() {
	return blood;
}
public void setBlood(String blood) {
	this.blood = blood;
}
public String getPrescription() {
	return prescription;
}
public void setPrescription(String prescription) {
	this.prescription = prescription;
}
public String getDose() {
	return dose;
}
public void setDose(String dose) {
	this.dose = dose;
}
public String getFees() {
	return fees;
}
public void setFees(String fees) {
	this.fees = fees;
}
public String getUrgency() {
	return urgency;
}
public void setUrgency(String urgency) {
	this.urgency = urgency;
}
 

}
