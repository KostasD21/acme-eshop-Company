package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This interface contains the signatures for the CRUD functionalities regarding {@link Product}
 */
@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

    /**
     * Search {@link Product} by category id
     *
     * @param categoryId of the {@link Product} that we need to search
     * @return a Category, if found
     */
    List<Product> findByCategoryId(Long categoryId);
    /**
     * Search {@link Product}
     * @return a List of products, if found
     */
    List<Product> findAll();
    /**
     * Save {@link Product}
     *
     * @param product of the {@link Product}
     * @return a Product
     */
    Product save (Product product);

    /**
     * Deletes a{@link Product} by given id
     * @param id
     */
    void deleteById(Long id);

    /**
     * Finds a {@link Product} by a given id
     * @param id
     */
    Product getProductById(Long id);

    /**
     * Finds the product by title
     *
     * @param title
     * @return the product
     */
    Product findByTitle(String title);
}
