package com.vehiclelicense.vehiclelicense.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.DrivingLicense;



@Repository
public interface DrivingLicenseRepository extends JpaRepository<DrivingLicense, Integer> {

}
