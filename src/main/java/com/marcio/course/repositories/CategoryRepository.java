package com.marcio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
