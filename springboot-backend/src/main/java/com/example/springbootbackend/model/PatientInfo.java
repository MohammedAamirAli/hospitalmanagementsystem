package com.example.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patientinfo")
public class PatientInfo {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
     @Column(name="patientname") 
	 private String patientname;
     @Column(name="age") 
	 private int age;
     @Column(name="visiteddoctername") 
	 private String visiteddoctorname;
     @Column(name="dateofvisit") 
	 private String dateofvisit;
     @Column(name="prescription") 
	 private String prescription;
	 
	 public PatientInfo() {
		 
		 
		 
	 }
	 
	 public PatientInfo(String patientname, int age, String visiteddoctorname, String dateofvisit,
			String prescription) {
		super();
	
		this.patientname = patientname;
		this.age = age;
		this.visiteddoctorname= visiteddoctorname;
		this.dateofvisit = dateofvisit;
		this.prescription = prescription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpatientname() {
		return patientname;
	}
	public void setpatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getvisiteddoctorname() {
		return visiteddoctorname;
	}
	public void setvisiteddoctorname(String visiteddoctorname) {
	  this.visiteddoctorname = visiteddoctorname;
	}
	public String getDateofvisit() {
		return dateofvisit;
	}
	public void setDateofvisit(String dateofvisit) {
		this.dateofvisit = dateofvisit;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	 
	 
	 

}
