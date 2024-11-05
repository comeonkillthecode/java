package com.akash.learn.spring.fourth_project_simple_web.service;

import com.akash.learn.spring.fourth_project_simple_web.model.Product;
import com.akash.learn.spring.fourth_project_simple_web.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public Product getProductById(int productId){
        return productRepo.findById(productId).get();
    }

    public Product createProduct(Product product) {
        productRepo.save(product);
        return product;
    }

    public Product updateProduct(int productId, Product product) {
        productRepo.saveAndFlush(product);
        return productRepo.findById(productId).get();
    }

    public void deleteProduct(int productId) {
        productRepo.deleteById(productId);
    }
}
