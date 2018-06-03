package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This domain class represents a order
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserOrder {
    /**
     * the order id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private Long id;
    /**
     * the order date
     */
    @Column(name = "ORDER_DATE", nullable = false)
    private Date orderDate;
    /**
     * the {@link BillingDetails}
     */
    @OneToOne
    @JoinColumn(name = "BILLING_DETAILS_ID")
    @NotNull
    private BillingDetails billingDetails;
    /**
     * the order status {@link OrderStatus}
     */
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    /**
     * the {@link List} of {@link ProductItem}
     */
    @OneToMany(mappedBy = "order")
    @NotEmpty
    private List<ProductItem> productItems = new ArrayList<>();
    /**
     * the {@link User} of the order
     */
    @OneToOne
    private User user;
    /**
     * the order reference that sent to the customer
     */
    //private String reference;

    public UserOrder(Date orderDate, BillingDetails billingDetails, OrderStatus orderStatus, List<ProductItem> productItems, User user) {
        this.orderDate = orderDate;
        this.billingDetails = billingDetails;
        this.orderStatus = orderStatus;
        this.productItems = productItems;
        this.user = user;
    }
}