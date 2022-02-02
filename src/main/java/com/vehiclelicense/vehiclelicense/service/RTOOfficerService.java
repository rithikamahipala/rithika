package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicense.vehiclelicense.entity.RTOOfficer;
import com.vehiclelicense.vehiclelicense.repo.RTOOfficerRepository;

@Service
public class RTOOfficerService {
	@Autowired
	RTOOfficerRepository rtoOfficerRepository;

	public RTOOfficer createRTOOfficer(RTOOfficer rtoOfficer) {
		// TODO Auto-generated method stub
		return rtoOfficerRepository.save(rtoOfficer);
	}

	public List<RTOOfficer> getRTOOfficers() {
		// TODO Auto-generated method stub
		return rtoOfficerRepository.findAll();
	}
	public boolean deleteAllRTOOfficer() {
		try {
			rtoOfficerRepository.deleteAll();
		}catch(Exception e)
		{
			return false;
		}
		
		// TODO Auto-generated method stub
		return true;
	}

	public RTOOfficer updateRTOOfficer(int rtoOfficerId, RTOOfficer obj) {
		Optional<RTOOfficer> addContainer=rtoOfficerRepository.findById(rtoOfficerId);
		if(addContainer.isPresent()) 
		{
			RTOOfficer oldObj=addContainer.get();
			oldObj.setUserName(obj.getUserName());
			oldObj.setPassword(obj.getPassword());
			System.out.println("Successfully updated");
			return rtoOfficerRepository.saveAndFlush(oldObj);
		}
		// TODO Auto-generated method stub
		System.out.println("No Object found with these Id");
		// TODO Auto-generated method stub
		return obj;
	}

}
