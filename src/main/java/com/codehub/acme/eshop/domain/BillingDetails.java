package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.PaymentMethods;
import com.codehub.acme.eshop.enumerator.ReceiptMethods;
import com.codehub.acme.eshop.enumerator.ShippingMethods;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * This domain class represents the billing details referring to the {@link UserOrder}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="BILLING_DETAILS")
public class BillingDetails implements Serializable {
    /**
     * the billing details id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BILLING_DETAILS_ID",nullable = false)
    private Long id;
    /**
     * the order
     */
    @OneToOne
    @JsonIgnore
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
    @Enumerated(EnumType.STRING)
    private ShippingMethods shippingMethod;
    /**
     * the {@link ReceiptMethods}
     */
    @Enumerated(EnumType.STRING)
    private ReceiptMethods receiptMethod;
    /**
     * the {@link PaymentMethods}
     */
    @Enumerated(EnumType.STRING)
    private PaymentMethods paymentMethod;
}