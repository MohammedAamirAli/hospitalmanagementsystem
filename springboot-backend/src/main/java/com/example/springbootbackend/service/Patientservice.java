package com.example.springbootbackend.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.springbootbackend.model.PatientInfo;
import com.example.springbootbackend.repository.PateintInfoRepository;

@Service
public class Patientservice {
    @Autowired
	PateintInfoRepository pateintInfoRepository;
    public PatientInfo savepatient(PatientInfo patientinfo){
    	
    	return pateintInfoRepository.save(patientinfo);
    }
    
  public Patientservice(PateintInfoRepository pateintInfoRepository)
  {
	  this.pateintInfoRepository=pateintInfoRepository;
  }
 
 public  PatientInfo getpatientById(int id){
	 return pateintInfoRepository.findById(id);
	 
 }
}

