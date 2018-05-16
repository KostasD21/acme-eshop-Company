package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.BillingDetails;
import com.codehub.acme.eshop.enumerator.PaymentMethods;
import com.codehub.acme.eshop.enumerator.ReceiptMethods;
import com.codehub.acme.eshop.enumerator.ShippingMethods;

import java.math.BigDecimal;

/**
 * This service contains the implementation of methods regarding the BillingDetails functionality
 *
 */

public class BillingDetailsServiceImpl implements BillingDetailsService {

    /**
     *{@inheritDoc}
     */

    @Override
    public BillingDetails getUserId(Long id) {
        return null;
    }

    /**
     *{@inheritDoc}
     */

    @Override
    public BillingDetails addBillingDetails(Long id, String address, String postCode, ShippingMethods shippingMethods, ReceiptMethods receiptMethods, PaymentMethods paymentMethods) {
        return null;
    }
}
