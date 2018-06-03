package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.PaymentMethods;
import com.codehub.acme.eshop.enumerator.ReceiptMethods;
import com.codehub.acme.eshop.enumerator.ShippingMethods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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

    /**
     * Constructor for the billing details
     *
     * @param address the address
     * @param postCode the post code
     * @param shippingMethod the shipping method
     * @param receiptMethod the receipt method
     * @param paymentMethod the payment method
     */
    public BillingDetails(String address, String postCode, @NotNull ShippingMethods shippingMethod, @NotNull ReceiptMethods receiptMethod, @NotNull PaymentMethods paymentMethod) {
        this.address = address;
        this.postCode = postCode;
        this.shippingMethod = shippingMethod;
        this.receiptMethod = receiptMethod;
        this.paymentMethod = paymentMethod;
    }
}