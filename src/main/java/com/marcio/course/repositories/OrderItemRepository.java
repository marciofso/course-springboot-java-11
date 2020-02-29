package com.marcio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
