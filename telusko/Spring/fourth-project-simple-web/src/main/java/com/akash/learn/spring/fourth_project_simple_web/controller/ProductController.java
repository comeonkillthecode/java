package com.akash.learn.spring.fourth_project_simple_web.controller;

import com.akash.learn.spring.fourth_project_simple_web.model.Product;
import com.akash.learn.spring.fourth_project_simple_web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
