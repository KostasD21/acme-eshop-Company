package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.service.CategoryService;
import com.codehub.acme.eshop.service.ProductService;
import com.codehub.acme.eshop.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    /**
     * {@link ProductService}
     */
    @Autowired
    private ProductService productService;

     @GetMapping(value ="/categories/{categoryId}/products")
      public List<Product> findProductsByCategoryId(@PathVariable Long categoryId){
          return productService.getAllProducts(categoryId);
    }

    }

