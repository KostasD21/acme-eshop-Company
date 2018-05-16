package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.Order;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;



/**
 * This interface contains the signatures for the CRUD functionalities regarding {@link Order}
 */
public interface OrderRepository extends CrudRepository<Order, Long> {


    /**
     * Search {@link Order} by id
     * @param Id of the {@link Order} that we need to search
     * @return {@link Order}
     */
    Optional<Order> findById(Long Id);

    /**
     * Delete an {@link Order} by id
     * @param id of the {@link Order} that we need to delete
     */
    void deleteById(Long id);

}
