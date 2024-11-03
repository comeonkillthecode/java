package com.akash.learn.spring.fourth_project_simple_web.controller;

import com.akash.learn.spring.fourth_project_simple_web.model.Product;
import com.akash.learn.spring.fourth_project_simple_web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
