package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This interface contains all the signatures of methods regarding the {@link Product} functionality
 */
public interface ProductService {

    /**
     *This method adds a new Product
     *
    // * @param title product title
    // * @param shortDescription a short description for the product
     //* @param longDescription a long description for the product
    // * @param productCode a unique code for each product
    // * @param quantity quantiy of the product
    // * @param stock the amount of stock
        * @param product
     */
    Product addProduct(Product product);

    /**
     * This method removes a Product
     *
     * @param id remove the product by ID
     */
    void removeProduct(Long id);

    /**
     * This method updates the details of the Product
     *
     * @param title product title
     * @param shortDescription a short description for the product
     * @param longDescription a long description for the product
     * @param productCode a unique code for each product
     * @param quantity of a producy
     * @param stock the amount of stock
     */
    void updateProductDetails(String title, String shortDescription, String longDescription, String productCode, Long quantity, Long stock);


    /**
     * This method finds a {@link Product} by the ID
     *
     * @param id of the Product
     * @return a Product object
     */
    Product findProductById(Long id);

    /**
     * This method finds a {@link Product} by it's name
     *
     * @param name of the Product
     * @return a Product object
     */
    Product findProductByName(String name);

    /**
     * This method finds the list of{@link Product} per category Id
     *
     * @param categoryId
     * @return
     */
    List<Product> getAllProducts(Long categoryId);

    /**
     * This method gets all the products
     * @return a {@link List} of {@link Product}
     */
    List<Product> findAllProducts();




}

