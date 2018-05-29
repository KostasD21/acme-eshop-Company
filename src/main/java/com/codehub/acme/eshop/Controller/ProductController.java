package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.repository.ProductItemRepository;
import com.codehub.acme.eshop.service.CategoryService;
import com.codehub.acme.eshop.service.ProductService;
import com.codehub.acme.eshop.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    /**
     * {@link ProductService}
     */
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductItemRepository productItemRepository;

    @GetMapping(value ="/categories/{categoryId}/products")
    public List<Product> findProductsByCategoryId(@PathVariable Long categoryId){
        return productService.getAllProducts(categoryId);
    }

    @GetMapping(value = "/getProductItems")
    public List<ProductItem> getAll(){
         return (List<ProductItem>) productItemRepository.findAll();
    }
    @PostMapping(value ="Products/new")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }



    }

