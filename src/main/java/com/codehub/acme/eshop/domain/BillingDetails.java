package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.PaymentMethods;
import com.codehub.acme.eshop.enumerator.ReceiptMethods;
import com.codehub.acme.eshop.enumerator.ShippingMethods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

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
    private Long id;
    /**
     * the order
     */
    @OneToOne
    private UserOrder userOrder;
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
    private ShippingMethods shippingMethods;
    /**
     * the {@link ReceiptMethods}
     */
    private ReceiptMethods receiptMethods;
    /**
     * the {@link PaymentMethods}
     */
    private PaymentMethods paymentMethods;
}