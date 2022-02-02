package com.vehiclelicense.vehiclelicense.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.Challan;

@Repository
public interface ChallanRepository extends JpaRepository<Challan, Integer> {

}
