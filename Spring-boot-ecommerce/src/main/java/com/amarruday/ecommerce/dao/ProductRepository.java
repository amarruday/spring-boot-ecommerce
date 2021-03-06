package com.amarruday.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amarruday.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
