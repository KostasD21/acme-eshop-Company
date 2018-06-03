package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.UserOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;



/**
 * This interface contains the signatures for the CRUD functionalities regarding {@link UserOrder}
 */
@Repository
public interface OrderRepository extends CrudRepository<UserOrder, Long> {


    /**
     * Search {@link UserOrder} by id
     * @param Id of the {@link UserOrder} that we need to search
     * @return {@link UserOrder}
     */
    Optional<UserOrder> findById(Long Id);

    /**
     * Adds a User Order
     * @param order
     * @return UserOrder
     */

    UserOrder save(UserOrder order);

    /**
     * Delete an {@link UserOrder} by id
     * @param id of the {@link UserOrder} that we need to delete
     */
    void deleteById(Long id);

    /**
     *Get a list of {@link UserOrder}
     */
    List<UserOrder> findAll();

}