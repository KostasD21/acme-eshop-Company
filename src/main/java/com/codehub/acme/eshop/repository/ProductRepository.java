package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This interface contains the signatures for the CRUD functionalities regarding {@link Product}
 */
public interface ProductRepository extends CrudRepository<Product, Long> {


    /**
     * Search {@link Product} by  id
     * @param name name of the category the product belongs
     * @return the products of the category
     */
    List<Product>  findByname (String name);

    /**
     * Search {@link Product} by title
     * @param title the product name
     * @return the product
     */
    List<Product>  findProductTitle (String title);

    /**
     * Search {@link Product} by id
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
     *This method deletes the product entry
     *
     * @param id product id
     * @param title product title
     */
    void deleteProduct(Long id,String title);

    /**
     * This method return the product
     *
     * @param id product id
     * @return product
     */
    boolean getById(Long id);

    /**
     * This method return the product
     *
     * @param title product title
     * @return product
     */
    boolean getByTitle(String title);







}
