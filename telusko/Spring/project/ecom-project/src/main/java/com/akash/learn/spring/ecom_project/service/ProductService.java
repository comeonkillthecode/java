package com.akash.learn.spring.ecom_project.service;

import com.akash.learn.spring.ecom_project.model.Product;
import com.akash.learn.spring.ecom_project.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
