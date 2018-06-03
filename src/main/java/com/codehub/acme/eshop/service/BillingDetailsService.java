package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.BillingDetails;

/**
 * This interface contains the signature of the methods regarding the functionality
 * {@link BillingDetails}
 *
 */
public interface BillingDetailsService {

    /**
     * This method gets the Billing Details by the userId
     * @param id the userId
     * @return {@link BillingDetails}
     */
     BillingDetails getByUserId(Long id);

    /**
     * This method adds the Billing Details
     *
     * @param billingDetails {@link BillingDetails}
     * @return {@link BillingDetails}
     */
     BillingDetails addBillingDetails(BillingDetails billingDetails);
}
