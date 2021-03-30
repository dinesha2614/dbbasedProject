package com.lk.codefest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.codefest.entity.user;
import com.lk.codefest.service.userService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="*",allowedHeaders = "*")

public class userController {
	
	@Autowired
	userService userService;
	
	
	@GetMapping("/")
	public String getUser() {
		return "Welcome to Users Rest API's";
	}
	
	@GetMapping("/GetAllUsers")
	
public List<user> getAllUsers(){
return userService.getAllUsers();
	
}

@PostMapping("/addUsers")
public List<user> saveUsers(@RequestBody List<user> users){
	return userService.addUser(users) ;
	
}


@PostMapping("/addUser")

public user saveUser(@RequestBody user user) {
	return userService.addUser(user);
	
}

@DeleteMapping("/deleteUser/{id}")

public String deleteUser(@PathVariable int id) {
	return userService.deleteUser(id);
}

@PutMapping("/updateUser")

public user updateUser(user user) {
	return userService.UpdateUser(user);
}
	

@GetMapping("{id}")
public user getUser(@PathVariable int id) {
	return userService.getUserById(id);
}

}
