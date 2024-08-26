package com.example.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctorsInfo")
public class DoctorInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="doctorname")
	private String doctorname;
	@Column(name="specializedfield")
	private String specializedfield;
	@Column(name="noofattendees")
	private int noofattendees;
	
	public DoctorInfo() {
		
	}
	
	
	public DoctorInfo(String doctorname, String specializedfield, int noofattendees) {
		super();
		this.doctorname = doctorname;
		this.specializedfield = specializedfield;
		this.noofattendees = noofattendees;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getSpecializedfield() {
		return specializedfield;
	}
	public void setSpecializedfield(String specializedfield) {
		this.specializedfield = specializedfield;
	}
	public int getNoofattendees() {
		return noofattendees;
	}
	public void setNoofattendees(int noofattendees) {
		this.noofattendees = noofattendees;
	}
	
	
	

}
