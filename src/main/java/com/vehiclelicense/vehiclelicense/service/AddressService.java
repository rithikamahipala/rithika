package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicense.vehiclelicense.entity.Address;
import com.vehiclelicense.vehiclelicense.repo.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;

	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}

	public List<Address> getAddresses() {
		return addressRepository.findAll();
	}

	public boolean deleteAllAddress() {
		try {
			addressRepository.deleteAll();
		}
		catch(Exception e) {
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public Address updateAddress(int addressId, Address obj) {
		Optional<Address> addContainer=addressRepository.findById(addressId);
		if(addContainer.isPresent()) 
		{
			Address oldObj=addContainer.get();
			oldObj.setCity(obj.getCity());
			oldObj.setState(obj.getState());
			System.out.println("Successfully updated");
			return addressRepository.saveAndFlush(oldObj);
		}
		System.out.println("No Object found with these Id");
		return obj;
	}

}
