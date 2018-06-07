package com.codehub.acme.eshop.controller;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.exception.NotFoundException;
import com.codehub.acme.eshop.repository.ProductItemRepository;
import com.codehub.acme.eshop.service.CategoryService;
import com.codehub.acme.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * This controller handles the requests for the {@link Product}
 */
@RestController
@RequestMapping(value = "/products")
public class ProductController {
    /**
     * {@link ProductService}
     */
    @Autowired
    private ProductService productService;

    /**
     * This Controller returns a list of {@link Product} by given Category Id
     * @param categoryId
     * @return {@link Product}
     */
    @GetMapping(value = "/{categoryId}")
    public List<Product> findProductsByCategoryId(@PathVariable Long categoryId){
       try {
           return productService.getAllProducts(categoryId);
       }catch(NoSuchElementException e){
           throw new NotFoundException("The category with this id:"+categoryId+" cannot be found");
       }
    }

    /**
     * This Controller adds a {@link Product}
     * @param product
     * @return {@link Product}
     */
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    /**
     * This method searches for a product
     *
     * @param text the client's free text
     * @return the {@link Product} that found
     */
    @GetMapping
    public Product searchProduct(@RequestParam String text) {
        return productService.findProductByTitle(text);
    }

    /**
     * This Controller deletes a {@link Product} by a given id
     */
    @DeleteMapping(value = "/{productId}")
    public void deleteProduct(@PathVariable Long productId){
        productService.removeProduct(productId);
    }

    /**
     * This Controller returns a list of {@link Product} out of stock
     */
    @GetMapping(value = "/productsOutOfStock")
    public List<Product> productsOutOfStock(){
        return productService.findAllProducts();
    }
}

