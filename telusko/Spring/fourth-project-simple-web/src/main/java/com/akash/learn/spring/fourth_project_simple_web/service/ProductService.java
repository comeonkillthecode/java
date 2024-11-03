package com.akash.learn.spring.fourth_project_simple_web.service;

import com.akash.learn.spring.fourth_project_simple_web.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "IPhone", 50000),
            new Product(102, "Google", 25000),
            new Product(103, "Oneplus", 20000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int productId){
        return products.stream().filter(p -> p.getId() == productId).findFirst().get();
    }

    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }
}
