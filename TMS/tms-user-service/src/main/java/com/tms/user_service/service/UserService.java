package com.tms.user_service.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.user_service.entity.User;
import com.tms.user_service.mapper.UserDTOMapper;
import com.tms.user_service.repository.UserRepository;

import commons.dto.UserDTO;
import commons.model.Roles;


@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserDTOMapper custDTOMapper;
	
	public List<UserDTO> getAllUsers() {
		return userRepo.findAll()
				.stream()
				.map(custDTOMapper).collect(Collectors.toList());
	}
	
	
	public UserDTO assignRoleToUser(Long id, Roles role) {
		Optional<User> optUser = userRepo.findById(id);
		if(!optUser.isEmpty()) {
			User user = optUser.get();
			user.setRole(role);
			user = userRepo.save(user);
			return custDTOMapper.apply(user);
		}
		return null;
	}


	public UserDTO getUserById(Long id) {
		Optional<User> optUser = userRepo.findById(id);
		if(!optUser.isEmpty()) {
			User user = optUser.get();
			return custDTOMapper.apply(user);
		}
		return null;
	}


	public String deleteUserById(Long id) {
		userRepo.deleteById(id);
		return "User deleted successfully!";
	}


	public UserDTO updateUser(Long id, UserDTO user) {
		Optional<User> optUser = userRepo.findById(id);
		if(!optUser.isEmpty()) {
			User currUser = optUser.get();
			currUser.setEmail(user.email());
			currUser.setUserName(user.userName());
			User updatedUser = userRepo.save(currUser);
			return custDTOMapper.apply(updatedUser);
		}
		
		return null;
	}
}
