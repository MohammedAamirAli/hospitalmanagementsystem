package com.example.springbootbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootbackend.model.DoctorInfo;
//import com.example.springbootbackend.model.PatientInfo;
import com.example.springbootbackend.repository.DoctorInfoRepository;
//import com.example.springbootbackend.repository.PateintInfoRepository;
@Service
public class Docterservice  {
	@Autowired
	DoctorInfoRepository docterInfoRepository;
    public DoctorInfo savedocter(DoctorInfo DocterInfo){
    	
    	return docterInfoRepository.save(DocterInfo);
    }
    
  public Docterservice(DoctorInfoRepository docterInfoRepository)
  {
	  this.docterInfoRepository=docterInfoRepository;
  }
 
 public  DoctorInfo getdocterByname(String name){
	 return docterInfoRepository.findByDoctorname(name);
	 
 }

public DoctorInfo getdocterByspecializedfield(String specializedfield) {
	// TODO Auto-generated method stub
	return docterInfoRepository.findByspecializedfield(specializedfield);
}
public List<DoctorInfo> getAlldoctors() {
	return docterInfoRepository.findAll();
}
}



