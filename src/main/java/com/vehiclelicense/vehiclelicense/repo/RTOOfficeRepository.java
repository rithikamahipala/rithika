package com.vehiclelicense.vehiclelicense.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.RTOOffice;


@Repository
public interface RTOOfficeRepository extends JpaRepository<RTOOffice, Integer> {
    
}
