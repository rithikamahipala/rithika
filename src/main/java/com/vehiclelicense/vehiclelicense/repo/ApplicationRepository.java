package com.vehiclelicense.vehiclelicense.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.Application;


@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {

}
