package com.akash.learn.spring.ecom_project.controller;

import com.akash.learn.spring.ecom_project.model.Product;
import com.akash.learn.spring.ecom_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

}
