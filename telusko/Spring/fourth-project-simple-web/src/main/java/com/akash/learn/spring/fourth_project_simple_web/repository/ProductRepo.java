package com.akash.learn.spring.fourth_project_simple_web.repository;

import com.akash.learn.spring.fourth_project_simple_web.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
