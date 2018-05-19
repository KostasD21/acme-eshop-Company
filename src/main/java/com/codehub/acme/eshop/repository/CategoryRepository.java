package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


/**
 * This interface contains the signatures for the CRUD functionalities regarding {@link Category}
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {


    /**
     * Search {@link Category} by id
     * @param Id of the {@link Category} that we need to search
     * @return a list with the Category, if found
     */
    Optional<Category> findById(Long Id);

    /**
     * Search {@link User} by name
     * @param name of the {@link Category} that we need to search
     * @return a list with the Category, if found
     */
    List<Category> findByName(String name);

    /**
     * Delete {@link Category} by it's id
     * @param id of {@link Category} to be deleted
     */
    void deleteById(Long id);

    /**
     * Delete {@link Category} by it's name
     * @param name of {@link Category} to be deleted
     */
    void deleteByName(String name);

}
