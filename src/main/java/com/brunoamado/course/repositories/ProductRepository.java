package com.brunoamado.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoamado.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
