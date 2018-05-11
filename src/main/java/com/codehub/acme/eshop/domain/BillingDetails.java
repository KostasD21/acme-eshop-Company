package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.PaymentMethods;
import com.codehub.acme.eshop.enumerator.ReceiptMethods;
import com.codehub.acme.eshop.enumerator.ShippingMethods;

public class BillingDetails {

    // UNIQUE ID TOU DOMAIN GIA THN DATABASE //
    private Long Id;
    private String adress;
    private String postCode;
    //TA PARAKATW ATTRIBUTES EINAI ENUM //
    private ShippingMethods shippingMethods;
    private ReceiptMethods receiptMethods;
    private PaymentMethods paymentMethods;

    public BillingDetails(){}

    public BillingDetails(Long id, String adress,
                          String postCode, ShippingMethods shippingMethods,
                          ReceiptMethods receiptMethods, PaymentMethods paymentMethods) {
        Id = id;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
