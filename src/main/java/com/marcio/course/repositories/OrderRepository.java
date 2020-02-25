package com.marcio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
