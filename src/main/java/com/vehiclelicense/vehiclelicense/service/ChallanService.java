package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicense.vehiclelicense.entity.Challan;
import com.vehiclelicense.vehiclelicense.repo.ChallanRepository;


@Service
public class ChallanService {
    @Autowired
    ChallanRepository challanRepository;
	public Challan createChallan(Challan challan) {
		// TODO Auto-generated method stub
		return challanRepository.save(challan);
	}

	public List<Challan> getChallans() {
		// TODO Auto-generated method stub
		return challanRepository.findAll();
	}

	public boolean deleteAllChallan() {
		try {
			challanRepository.deleteAll();
		}catch(Exception e)
		{
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public Challan updateChallan(int challanId, Challan obj) {
		Optional<Challan> addContainer=challanRepository.findById(challanId);
		if(addContainer.isPresent()) 
		{
			Challan oldObj=addContainer.get();
			oldObj.setChallanNumber(obj.getChallanNumber());
			oldObj.setVehicleNumber(obj.getVehicleNumber());
			System.out.println("Successfully updated");
			return challanRepository.saveAndFlush(oldObj);
		}
		// TODO Auto-generated method stub
		System.out.println("No Object found with these Id");
		// TODO Auto-generated method stub
		return obj;
	}

}
