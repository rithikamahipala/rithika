package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicense.vehiclelicense.entity.RTOOffice;
import com.vehiclelicense.vehiclelicense.repo.RTOOfficeRepository;

@Service
public class RTOOfficeService {
	@Autowired
	RTOOfficeRepository rtoOfficeRepository;
       public RTOOffice createRTOOffice(RTOOffice rtoOffice) {
		// TODO Auto-generated method stub
		return rtoOfficeRepository.save(rtoOffice);
	}
       public List<RTOOffice> getRTOOffices() {
    	   return rtoOfficeRepository.findAll();
       }
	public boolean deleteAllRTOOffice() {
		try {
			rtoOfficeRepository.deleteAll();
		}catch(Exception e)
		{
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}
	public RTOOffice updateRTOOffice(int rtoOfficeId, RTOOffice obj) {
		Optional<RTOOffice> addContainer=rtoOfficeRepository.findById(rtoOfficeId);
		if(addContainer.isPresent()) 
		{
			RTOOffice oldObj=addContainer.get();
			oldObj.setRtoName(obj.getRtoName());
			oldObj.setRtoId(obj.getRtoId());
			System.out.println("Successfully updated");
			return rtoOfficeRepository.saveAndFlush(oldObj);
		}
		// TODO Auto-generated method stub
		System.out.println("No Object found with these Id");
		// TODO Auto-generated method stub
		return obj;
	}

}