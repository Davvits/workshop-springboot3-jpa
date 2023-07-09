package com.practice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
