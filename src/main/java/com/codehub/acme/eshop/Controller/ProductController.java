package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.service.ProductService;
import com.codehub.acme.eshop.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping(value = "/categories/search/products/{categoryId}")
        public List<Product> getProductsByCategoryId(@PathVariable Long categoryId){
            return productService.getAllProductsByCategoryId(categoryId);
        }
    }

