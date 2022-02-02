package com.vehiclelicense.vehiclelicense.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.RTOOfficer;

@Repository
public interface RTOOfficerRepository extends JpaRepository<RTOOfficer, Integer> {

}
