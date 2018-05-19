package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Order;
import com.codehub.acme.eshop.domain.Purchase;
import com.codehub.acme.eshop.enumerator.Provider;
import com.codehub.acme.eshop.enumerator.PurchaseStatus;

import java.math.BigDecimal;

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
     * Submits a Purchase on DB
     * @param orderId the id of the Order that gets purchased
     * @param provider bank that provides the transaction
     * @param referenceId UID between bank provider and customer
     * @param purchaseStatus the status of the {@link Purchase}
     * @param amount total amount of the order + provider fee
     */
    void submitPurchase(Order orderId, Provider provider, String referenceId, PurchaseStatus purchaseStatus, BigDecimal amount);

    /**
     * Cancels a purchase
     * @param id the {@link Purchase} id
     */
    void cancelPurchase(Long id);


}
