package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Purchase;

/**
 * This interface contains the signatures of methods regarding the {@link Purchase} functionality
 */
public interface PurchaseService {

    /**
     * Search for Purchase by Id
     * @param Id Purchase Id
     * @return {@link Purchase}
     */
    Purchase findById(Long Id);

    /**
     * Search by Order id
     * @param orderId Order Id
     * @return {@link Purchase}
     */
    Purchase findByOrderId(Long orderId);

    /**
     * Completes a purchase
     *
     * @param purchase {@link Purchase}
     * @return the {@link Purchase}
     */
    Purchase completePurchase(Purchase purchase);

    /**
     * Cancels a purchase
     *
     * @param id the {@link Purchase} id
     */
    void cancelPurchase(Long id);


}
