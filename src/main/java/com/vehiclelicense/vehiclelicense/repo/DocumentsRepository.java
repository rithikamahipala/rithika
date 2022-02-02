package com.vehiclelicense.vehiclelicense.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.Documents;

@Repository
public interface DocumentsRepository extends JpaRepository<Documents, Integer> {

}
