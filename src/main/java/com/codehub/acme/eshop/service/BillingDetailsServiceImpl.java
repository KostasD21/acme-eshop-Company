package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.BillingDetails;
import com.codehub.acme.eshop.enumerator.PaymentMethods;
import com.codehub.acme.eshop.enumerator.ReceiptMethods;
import com.codehub.acme.eshop.enumerator.ShippingMethods;
import com.codehub.acme.eshop.repository.BillingDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * This service contains the implementation of methods regarding the {@link BillingDetails} functionality
 */
@Service
public class BillingDetailsServiceImpl implements BillingDetailsService {

    /**
     * {@link BillingDetailsRepository}
     */
    @Autowired
    private BillingDetailsRepository billingDetailsRepository;

    /**
     *{@inheritDoc}
     */
    @Override
    public BillingDetails getByUserId(Long id) {
        return null;
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public BillingDetails addBillingDetails(BillingDetails billingDetails) {
        return billingDetailsRepository.save(billingDetails);
    }
}
