package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.domain.Purchase;
import com.codehub.acme.eshop.enumerator.Provider;
import com.codehub.acme.eshop.enumerator.PurchaseStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    /**
     * Search for Purchase by Id
     * @param Id Purchase Id
     * @return {@link Purchase}
     */
    @Override
    public Purchase findById(Long Id) {
        return null;
    }

    /**
     * Search by Order id
     * @param orderId Order Id
     * @return {@link Purchase}
     */
    @Override
    public Purchase findByOrderId(Long orderId) {
        return null;
    }

    /**
     * Submits a Purchase on DB
     * @param orderId the id of the Order that gets purchased
     * @param provider bank that provides the transaction
     * @param referenceId UID between bank provider and customer
     * @param purchaseStatus the status of the {@link Purchase}
     * @param amount total amount of the order + provider fee
     */
    @Override
    public void submitPurchase(UserOrder orderId, Provider provider, String referenceId, PurchaseStatus purchaseStatus, BigDecimal amount) {

    }

    /**
     * Cancels a purchase
     * @param id the {@link Purchase} id
     */
    @Override
    public void cancelPurchase(Long id) {

    }
}
