package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.PaymentMethods;
import com.codehub.acme.eshop.enumerator.ReceiptMethods;
import com.codehub.acme.eshop.enumerator.ShippingMethods;


import javax.persistence.*;

/**
 * This domain class represents the billing details referring to the {@link UserOrder}
 */
@Entity
public class BillingDetails {
    /**
     * the billing details id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
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


    public BillingDetails(){};


    public BillingDetails(Long id, UserOrder userOrder, String address,
                          String postCode, ShippingMethods shippingMethods,
                          ReceiptMethods receiptMethods, PaymentMethods paymentMethods) {
        Id = id;
        this.userOrder = userOrder;
        this.address = address;
        this.postCode = postCode;
        this.shippingMethods = shippingMethods;
        this.receiptMethods = receiptMethods;
        this.paymentMethods = paymentMethods;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public UserOrder getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(UserOrder userOrder) {
        this.userOrder = userOrder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public ShippingMethods getShippingMethods() {
        return shippingMethods;
    }

    public void setShippingMethods(ShippingMethods shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    public ReceiptMethods getReceiptMethods() {
        return receiptMethods;
    }

    public void setReceiptMethods(ReceiptMethods receiptMethods) {
        this.receiptMethods = receiptMethods;
    }

    public PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(PaymentMethods paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}