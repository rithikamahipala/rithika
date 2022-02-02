package com.vehiclelicense.vehiclelicense.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicense.vehiclelicense.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
