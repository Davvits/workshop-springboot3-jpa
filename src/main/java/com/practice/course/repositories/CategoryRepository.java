package com.practice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.course.entities.Category;



public interface CategoryRepository extends JpaRepository<Category, Long>{

}
