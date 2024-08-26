package com.example.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbackend.model.DoctorInfo;
//import com.example.springbootbackend.model.PatientInfo;
import com.example.springbootbackend.repository.DoctorInfoRepository;
import com.example.springbootbackend.service.Docterservice;
//import com.example.springbootbackend.service.Patientservice;

@RestController
@CrossOrigin(origins="*")
public class Doctercontroller {
		
		@Autowired
		private Docterservice docterservice;
	     
		@PostMapping("/registerdocter")
		public String register( @RequestBody DoctorInfo docterinfo) {
		 DoctorInfo docter = docterservice.savedocter(docterinfo);
			 return " succesfully created";
			
		} 
		
		@GetMapping("/finddocter/{name}")
		public DoctorInfo findUser(@PathVariable String name){
			return docterservice.getdocterByname(name);
		}

		@GetMapping("/find/{specializedfield}")
		public DoctorInfo find(@PathVariable String specializedfield){
			return docterservice.getdocterByspecializedfield(specializedfield);
		}
				
		@GetMapping("/findAll")
			public List<DoctorInfo> find(){
				return docterservice.getAlldoctors();
			}
		
		//@GetMapping("/patients")
		//public Iterable<PatientInfo>  getAllPatients(){
			
			//return pateintservice.findAll();
		//}
		
	}
	
	

