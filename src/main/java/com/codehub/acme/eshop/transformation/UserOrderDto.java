package com.codehub.acme.eshop.transformation;

import com.codehub.acme.eshop.domain.BillingDetails;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.enumerator.OrderStatus;

import java.util.Date;

public class UserOrderDto {
    /**
     * the order id
     */
    private Long id;
    /**
     * the order date
     */
    private Date orderDate;
    /**
     * the {@link BillingDetails}
     */
    private BillingDetails billingDetails;
    /**
     * the order status {@link OrderStatus}
     */
    private OrderStatus orderStatus;
    /**
     * the order reference that sent to the customer
     */
    private String reference;

    public UserOrderDto(UserOrder order) {
        this.id = order.getId();
        this.orderDate = order.getOrderDate();
        this.billingDetails = order.getBillingDetails();
        this.orderStatus = order.getOrderStatus();
        this.reference = order.getReference();
    }

    /**
     * this method gets the id
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * this method sets the id
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * this method gets the orderDate
     *
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * this method sets the orderDate
     *
     * @param orderDate the orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * this method gets the billingDetails
     *
     * @return the billingDetails
     */
    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    /**
     * this method sets the billingDetails
     *
     * @param billingDetails the billingDetails
     */
    public void setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }

    /**
     * this method gets the orderStatus
     *
     * @return the orderStatus
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * this method sets the orderStatus
     *
     * @param orderStatus the orderStatus
     */
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * this method gets the reference
     *
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * this method sets the reference
     *
     * @param reference the reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }
}
