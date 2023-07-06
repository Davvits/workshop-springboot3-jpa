package com.practice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
