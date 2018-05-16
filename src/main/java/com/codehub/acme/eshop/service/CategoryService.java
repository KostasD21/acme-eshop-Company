package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;

import java.util.List;
/**
 *
 *This interface contains the signature of methods regarding the functionality
 * {@link com.codehub.acme.eshop.domain.Category}
 *
 */
public interface CategoryService {
    /**
     *This method adds a Category to the Database
     * @param description  the Category description
     * @param id           the Category id
     * @param name         the Category name
     * @return {@link Category}
     */
    Category addCategory(Long id,String name,String description);

    /**
     * This method removes a Category from the Database
     * @param name  the Category name
     *
     */
    void removeCategory(String name);

    /**
     * This method returns the list of Categories from the database
     * @return a {@link List} of {@link Product}
     */
     List<Product> getAllCategories();

    /**
     * This method returns the list of products regarding on the give Category
     *
     * @param name the Category name
     * @return a {@link List} of {@link Product}
     *
     */
     List<Product> productsPerGivenCategory(String name);
}
