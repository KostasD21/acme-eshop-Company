package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.Category;
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
     *
     * @param id of the {@link Category} that we need to search
     * @return a Category, if found
     */
    Optional<Category> getCategoryById(Long id);

    /**
     * Search {@link Category} by name
     *
     * @param name of the {@link Category} that we need to search
     * @return a Category, if found
     */
    Optional<Category> findByName(String name);

    /**
     * Delete {@link Category} by it's id
     *
     * @param id of {@link Category} to be deleted
     */
    void deleteById(Long id);

    /**
     * Delete {@link Category} by it's name
     *
     * @param name of {@link Category} to be deleted
     */
    void deleteByName(String name);

    /**
     * Get the list of {@link Category}
     *
     */
    List<Category> findAll();

    /**
     * Add a Category to the DB{@link Category}
     */
   Category save(Category category);


}



