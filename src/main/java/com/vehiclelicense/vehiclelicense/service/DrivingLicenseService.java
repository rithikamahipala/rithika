package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.DrivingLicense;
import com.vehiclelicense.vehiclelicense.repo.DrivingLicenseRepository;

@Repository
public class DrivingLicenseService {
	@Autowired
	DrivingLicenseRepository drivingLicenseRepository;

	public DrivingLicense createDrivingLicense(DrivingLicense drivingLicense) {
		// TODO Auto-generated method stub
		return drivingLicenseRepository.save(drivingLicense);
	}

	public List<DrivingLicense> getDrivingLicenses() {
		// TODO Auto-generated method stub
		return drivingLicenseRepository.findAll();
	}

	public boolean deleteAllDrivingLicense() {
		try {
			drivingLicenseRepository.deleteAll();
		}catch(Exception e)
		{
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public DrivingLicense updateDrivingLicense(int drivingLicenseId, DrivingLicense obj) {
		Optional<DrivingLicense> addContainer=drivingLicenseRepository.findById(drivingLicenseId);
		if(addContainer.isPresent()) 
		{
			DrivingLicense oldObj=addContainer.get();
			oldObj.setDrivingLicenseNumber(obj.getDrivingLicenseNumber());
			oldObj.setDateOfIssue(obj.getDateOfIssue());
			System.out.println("Successfully updated");
			return drivingLicenseRepository.saveAndFlush(oldObj);
		}
		// TODO Auto-generated method stub
		System.out.println("No Object found with these Id");
		// TODO Auto-generated method stub
		return obj;
	}

}
