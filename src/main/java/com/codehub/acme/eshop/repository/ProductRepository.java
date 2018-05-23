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

    /**
     * Search a list of Products regarding the given category name{@link Product}
      * @param productId
     * @return list {@link Product}
     */
 List<Product> findByCategoryId(Long productId);

}
