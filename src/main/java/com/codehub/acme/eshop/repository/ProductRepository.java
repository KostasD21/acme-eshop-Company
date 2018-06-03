package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This interface contains the signatures for the CRUD functionalities regarding {@link Product}
 */
@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findAll();
    Product save (Product product);
    Product findByTitle(String title);
}
