package com.marcio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
