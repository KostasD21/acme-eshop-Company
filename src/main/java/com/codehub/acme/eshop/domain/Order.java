package com.codehub.acme.eshop.domain;

import java.util.Date;
//MANY TO ONE RELATIONSHIP WITH USER DOMAIN //

// ONE TO MANY RELATIONSHIP WITH PRODUCT_ORDER //

//ONE TO ONE RELATIONSHIP WITH SHOPPING _BASKET //

// ONE TO ONE RELATIONSHIP WITH BILLING_DETAILS DOMAIN //
public class Order {
    // UNIQUE ID OF ORDER FOR THE DATABASE//
    private Long id;

    private Date orderDate;
    private Long basketId;
    private Long billingDetails;

    public Order(){}

    public Order(Long id, Date orderDate, Long basketId, Long billingDetails) {
        this.id = id;
        this.orderDate = orderDate;
        this.basketId = basketId;
        this.billingDetails = billingDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getBasketId() {
        return basketId;
    }

    public void setBasketId(Long basketId) {
        this.basketId = basketId;
    }

    public Long getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(Long billingDetails) {
        this.billingDetails = billingDetails;
    }
}
