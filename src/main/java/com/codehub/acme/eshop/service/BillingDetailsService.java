package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.BillingDetails;
import com.codehub.acme.eshop.enumerator.PaymentMethods;
import com.codehub.acme.eshop.enumerator.ReceiptMethods;
import com.codehub.acme.eshop.enumerator.ShippingMethods;

/**
 * This interface contains the signature of the methods regarding the functionality
 * {@link com.codehub.acme.eshop.domain.BillingDetails}
 *
 */
public interface BillingDetailsService {

    /**
     * This method gets the Billing Details by the userId
     * @param id the userId
     * @return {@link BillingDetails}
     */
     BillingDetails getUserId(Long id);

    /**
     * This method adds the Billing Details
     * @param id        the user ID
     * @param address   the user address
     * @param postCode  the user postcode
     * @param shippingMethods   the shipping methods
     * @param receiptMethods    the receipt methods
     * @param paymentMethods    the payment methods
     * @return {@link BillingDetails}
     */
     BillingDetails addBillingDetails(Long id, String address, String postCode,
                                            ShippingMethods shippingMethods,ReceiptMethods receiptMethods,
                                            PaymentMethods paymentMethods);



}
