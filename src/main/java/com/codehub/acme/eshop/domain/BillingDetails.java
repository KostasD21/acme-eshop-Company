package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.PaymentMethods;
import com.codehub.acme.eshop.enumerator.ReceiptMethods;
import com.codehub.acme.eshop.enumerator.ShippingMethods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * This domain class represents the billing details referring to the {@link UserOrder}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BillingDetails {
    /**
     * the billing details id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BILLING_DETAILS_ID",nullable = false)
    private Long id;
    /**
     * the address
     */
    private String address;
    /**
     * the post code
     */
    private String postCode;
    /**
     * the {@link ShippingMethods}
     */
    @Enumerated(EnumType.STRING)
    @NotNull
    private ShippingMethods shippingMethod;
    /**
     * the {@link ReceiptMethods}
     */
    @Enumerated(EnumType.STRING)
    @NotNull
    private ReceiptMethods receiptMethod;
    /**
     * the {@link PaymentMethods}
     */
    @Enumerated(EnumType.STRING)
    @NotNull
    private PaymentMethods paymentMethod;

    public BillingDetails(String address, String postCode, @NotNull ShippingMethods shippingMethod, @NotNull ReceiptMethods receiptMethod, @NotNull PaymentMethods paymentMethod) {
        this.address = address;
        this.postCode = postCode;
        this.shippingMethod = shippingMethod;
        this.receiptMethod = receiptMethod;
        this.paymentMethod = paymentMethod;
    }
}