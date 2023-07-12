package com.practice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.course.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long>{

}
