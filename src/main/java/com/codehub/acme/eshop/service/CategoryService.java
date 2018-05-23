package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 *This interface contains the signature of methods regarding the functionality
 * {@link Category}
 *
 */
public interface CategoryService {
    /**
     *This method adds a Category to the Database
   //  * @param description  the Category description
   //  * @param id           the Category id
   //  * @param name         the Category name
     * @return {@link Category}
     */
    void addCategory(Category category);

    /**
     * This method removes a Category from the Database
     * @param name  the Category name
     *
     */
    void removeCategory(String name);

    /**
     * This method removes a {@link Category} from the DB regarding the given Id
     * @param id the Category id
     */
    void removeCategorybyId(Long id);
    /**
     * This method returns the list of Categories from the database
     * @return a {@link List} of {@link Product}
     */
     List<Category> getAllCategories();

    /**
     * This method returns the list of products regarding on the give Category
     *
     * @param name the Category name
     * @return a {@link List} of {@link Product}
     *
     */
     List<Product> productsPerGivenCategory(String name);
    /**
     * This methods returns a Category from the DB regarding on the ginen Id
     * @param id the id of the Category
     * @return a {@link Category}
     */
    Category getCategoryById(Long id);

    /**
     * This methods searches and returns a Category from the DB regarding on the given name
     * @param name the name of the Category
     * @return a {@link Category}
     */
    Category findByName(String name);



}
