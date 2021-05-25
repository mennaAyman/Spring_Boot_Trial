package com.edafa.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edafa.spring.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	List<User> findByStatus(String status);

	User findByUserName(String userName);
}
