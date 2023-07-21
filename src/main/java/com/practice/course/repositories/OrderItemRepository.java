package com.practice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.course.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
