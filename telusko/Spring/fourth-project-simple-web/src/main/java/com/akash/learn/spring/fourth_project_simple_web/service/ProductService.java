package com.akash.learn.spring.fourth_project_simple_web.service;

import com.akash.learn.spring.fourth_project_simple_web.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = Arrays.asList(
            new Product(101, "IPhone", 50000),
            new Product(102, "Google", 25000),
            new Product(103, "Oneplus", 20000));

    public List<Product> getProducts(){
        return products;
    }
}
