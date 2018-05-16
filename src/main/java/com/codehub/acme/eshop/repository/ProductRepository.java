package com.codehub.acme.eshop.repository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository <Product, Long>{


    /**
     *
     * @param categoryName name of the category the product belongs
     * @return the products of the category
     */
    List<Product>  findProductByCategoryId (String categoryName);

    /**
     *
     * @param title the product name
     * @return the product
     */
    List<Product>  findProductByTitle (String title);

    /**
     *
     * @param id the product id
     * @return the id
     */
    List<Product> findById(Long id);


    /**
     *This method adds a new Product
     *
     * @param title product title
     * @param shortDescription a short description for the product
     * @param longDescription a long description for the product
     * @param productCode a unique code for each product
     * @param quantity quantiy of the product
     * @param stock the amount of stock
     */
    void addProduct(String title, String shortDescription, String longDescription, String productCode, Long quantity, Long stock);

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
     *
     * @param id product id
     * @param title product title
     */
    void deleteProduct(Long id,String title);

    /**
     *
     * @param id product id
     * @return product
     */
    boolean getById(Long id);

    /**
     *
     * @param title product title
     * @return product
     */
    boolean getByTitle(Long title);







}
