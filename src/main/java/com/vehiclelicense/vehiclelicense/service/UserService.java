package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicense.vehiclelicense.entity.User;
import com.vehiclelicense.vehiclelicense.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public boolean deleteAllUser() {
		try {
			userRepository.deleteAll();
		}catch(Exception e)
		{
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public User updateUser(int userId, User obj) {
		Optional<User> addContainer=userRepository.findById(userId);
		if(addContainer.isPresent()) 
		{
			User oldObj=addContainer.get();
			oldObj.setEmail(obj.getEmail());
			oldObj.setPassword(obj.getPassword());
			System.out.println("Successfully updated");
			return userRepository.saveAndFlush(oldObj);
		}
		// TODO Auto-generated method stub
		System.out.println("No Object found with these Id");
		// TODO Auto-generated method stub
		return obj;
	}

}
