package com.vehiclelicense.vehiclelicense.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.Appointment;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
     
}
