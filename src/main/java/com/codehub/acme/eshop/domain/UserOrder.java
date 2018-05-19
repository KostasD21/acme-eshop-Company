package com.codehub.acme.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * This domain class represents a order
 /**
 * the order id
 */


@Entity
public class UserOrder {
    /**
     * the order id
     */
    //  @Column(name = "ORDER_ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * the order date
     */
    private Date orderDate;
    /**
     * the {@link BillingDetails}
     */
    @OneToOne
    // @JoinColumn(name = "BILLING_DETAILS_ID")
    private BillingDetails billingDetails;

    public UserOrder() {}

    public UserOrder(Long id, Date orderDate, BillingDetails billingDetails) {
        this.id = id;
        this.orderDate = orderDate;
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

    public BillingDetails getBillingDetails() {
        return billingDetails;
    }
}