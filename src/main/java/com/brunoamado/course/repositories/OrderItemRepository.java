package com.brunoamado.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoamado.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
