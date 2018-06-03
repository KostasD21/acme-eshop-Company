package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * This repository contains the signature of the methods that interact with the DB regarding {@link Purchase}
 */
@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

    /**
     * Searches for a {@link Purchase}
     * @param id of the Purchase to be searched
     * @return a list of {@link Purchase}
     */
    Optional<Purchase> findById(Long id);

    /**
     * Searches for a {@link Purchase}
     * @param id of the Purchase to be searched
     * @return {@link Purchase}
     */
    Purchase getById(Long id);

    /**
     * Deletes a {@link Purchase}
     * @param id of the purchase
     */
    void deleteById(Long id);

    /**
     * Updates a {@link Purchase}
     * @param purchase the purchase
     */
    Purchase save(Purchase purchase);
}
