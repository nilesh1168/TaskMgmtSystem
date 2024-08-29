package com.tms.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tms.user_service.service.UserService;

import commons.dto.UserDTO;

import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/tms/api/v1")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<UserDTO> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public UserDTO getUserById(@PathVariable Long id){
		return userService.getUserById(id);
	}
	
//	@PutMapping("/assign-role-to-user")
//	public UserDTO assignRoleToUser(@RequestParam Long id, @RequestBody UserDTO user) {
//		//TODO: process POST request
//		return userService.assignRoleToUser(id, user.role());
//	}

	//create user - JWT
	//delete user
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable Long id) {
		return userService.deleteUserById(id);
	}
	
	//update user
	public UserDTO updateUser(@RequestBody UserDTO user, @RequestParam Long id) {
		UserDTO updatedUser = userService.updateUser(id, user);
		return updatedUser;
	}
}
