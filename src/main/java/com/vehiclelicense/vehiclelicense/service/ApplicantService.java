package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicense.vehiclelicense.entity.Applicant;
import com.vehiclelicense.vehiclelicense.repo.ApplicantRepository;

@Service
public class ApplicantService {
	@Autowired
	ApplicantRepository applicantRepository;

	public Applicant createApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		return applicantRepository.save(applicant);
	}

	public List<Applicant> getApplicants() {
		// TODO Auto-generated method stub
		return applicantRepository.findAll();
	}

	public boolean deleteAllApplicant() {
		try {
			applicantRepository.deleteAll();
		}catch(Exception e)
		{
			return false;
		}
		
		// TODO Auto-generated method stub
		return true;
	}
	

	public Applicant updateApplicant(int applicantId, Applicant obj) {
		Optional<Applicant> addContainer=applicantRepository.findById(applicantId);
		if(addContainer.isPresent()) 
		{
			Applicant oldObj=addContainer.get();
			oldObj.setFirstName(obj.getFirstName());
			oldObj.setLastName(obj.getLastName());
			System.out.println("Successfully updated");
			return applicantRepository.saveAndFlush(oldObj);
		}
		// TODO Auto-generated method stub
		System.out.println("No Object found with these Id");
		return obj;
	}

}
