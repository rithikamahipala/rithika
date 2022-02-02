package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicense.vehiclelicense.entity.Application;
import com.vehiclelicense.vehiclelicense.repo.ApplicationRepository;

@Service
public class ApplicationService {
	@Autowired
	ApplicationRepository applicationRepository;

	public Application createApplication(Application application) {
		// TODO Auto-generated method stub
		return applicationRepository.save(application);
	}

	public List<Application> getApplications() {
		// TODO Auto-generated method stub
		return applicationRepository.findAll();
	}

	public boolean deleteAllApplication() {
		try {
			applicationRepository.deleteAll();
		}catch(Exception e)
		{
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public Application updateApplication(int applicationId, Application obj) {
		Optional<Application> addContainer=applicationRepository.findById(applicationId);
		if(addContainer.isPresent()) 
		{
			Application oldObj=addContainer.get();
			oldObj.setApplicationNumber(obj.getApplicationNumber());
			oldObj.setApplicationDate(obj.getApplicationDate());
			System.out.println("Successfully updated");
			return applicationRepository.saveAndFlush(oldObj);
		}
		// TODO Auto-generated method stub
		System.out.println("No Object found with these Id");
		// TODO Auto-generated method stub
		return obj;
	}

}
