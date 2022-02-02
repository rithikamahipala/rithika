package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicense.vehiclelicense.entity.Appointment;
import com.vehiclelicense.vehiclelicense.repo.AppointmentRepository;

@Service
public class AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;

	public Appointment createAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

	public List<Appointment> getAppointments() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	public boolean deleteAllAppointment() {
		try {
			appointmentRepository.deleteAll();
		}catch(Exception e)
		{
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public Appointment updateAppointment(int appointmentId, Appointment obj) {
		Optional<Appointment> addContainer=appointmentRepository.findById(appointmentId);
		if(addContainer.isPresent()) 
		{
			Appointment oldObj=addContainer.get();
			oldObj.setAppointmentNumber(obj.getAppointmentNumber());
			oldObj.setTestDate(obj.getTestDate());
			System.out.println("Successfully updated");
			return appointmentRepository.saveAndFlush(oldObj);
		}
		// TODO Auto-generated method stub
		System.out.println("No Object found with these Id");
		// TODO Auto-generated method stub
		return obj;
	}

}
