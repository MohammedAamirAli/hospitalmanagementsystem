package com.example.springbootbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbackend.model.PatientInfo;
import com.example.springbootbackend.repository.PateintInfoRepository;
import com.example.springbootbackend.service.Patientservice;

@RestController
@CrossOrigin(origins="*")
public class Patientcontroller {
	
	@Autowired
	private Patientservice pateintservice;
     
	@PostMapping("/registerpatient")
	public String register( @RequestBody PatientInfo patientinfo) {
	 PatientInfo patient = pateintservice.savepatient(patientinfo);
		 return  "succesfully created";
		
	} 
	
	@GetMapping("/findUser/{id}")
	public PatientInfo findUser(@PathVariable int id){
		return pateintservice.getpatientById(id);
	}
			
	
	//@GetMapping("/patients")
	//public Iterable<PatientInfo>  getAllPatients(){
		
		//return pateintservice.findAll();
	//}
	
}
