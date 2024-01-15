package com.brunoamado.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoamado.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
