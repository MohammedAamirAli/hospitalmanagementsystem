package com.example.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbackend.model.DoctorInfo;

@Repository
public interface DoctorInfoRepository extends JpaRepository<DoctorInfo, Integer> {

	public DoctorInfo findByDoctorname(String doctorname);

	public DoctorInfo findByspecializedfield(String specializedfield);

	//DoctorInfo findByName(String name);

}
