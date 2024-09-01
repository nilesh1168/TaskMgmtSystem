package com.tms.user_service.mapper;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import com.tms.user_service.entity.User;

import commons.dto.UserDTO;

@Service
public class UserDTOMapper implements Function<User, UserDTO> {

	@Override
	public UserDTO apply(User user) {
		// TODO Auto-generated method stub
		return new UserDTO(user.getUserName(), user.getEmail(), user.getRole());
	}

}
