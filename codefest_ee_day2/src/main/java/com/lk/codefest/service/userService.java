package com.lk.codefest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.codefest.entity.user;
import com.lk.codefest.repository.userRepository;



@Service
public class userService {
	@Autowired
	
	userRepository userRepository;
	
	public List<user> addUser(List<user> users) {
	return userRepository.saveAll(users);
		
	}
	
	public user addUser(user user) {
		return userRepository.save(user);
			
		}
	
	public user UpdateUser(user user) {
	user availbleuser=userRepository.findById(user.getId()).orElse(null);
	if(availbleuser!=null) {
		availbleuser.setAge(user.getAge());
		availbleuser.setName(user.getName());
		availbleuser.setPassword(user.getPassword());
		availbleuser.setTelephone(user.getTelephone());
		userRepository.save(availbleuser);
		
	}
	return availbleuser;
		
		
	}
	
	public String deleteUser(int id) {
		
			userRepository.deleteById(id);
		
		return "User Delected"+id; 
			
			
		}
	
	
	public List<user> getAllUsers(){
		return userRepository.findAll();
	}
	
	public user getUserById(int id){
		return userRepository.findById(id).orElse(null);
	}
	
	
	
	
	

}
