package com.tms.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.user_service.entity.User;

public interface UserRepository extends JpaRepository<User ,Long> {

}
