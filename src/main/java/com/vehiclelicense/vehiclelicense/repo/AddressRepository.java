package com.vehiclelicense.vehiclelicense.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
