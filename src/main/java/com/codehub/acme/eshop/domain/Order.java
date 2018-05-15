package com.codehub.acme.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * This domain class represents a order
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Order extends ShoppingBasket {
    /**
     * the order id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID", nullable = false)
    private Long id;
    /**
     * the order date
     */
    private Date orderDate;
    /**
     * the {@link BillingDetails}
     */
    @OneToOne(optional=false)
    @JoinColumn(name = "BILLING_DETAILS_ID")
    private BillingDetails billingDetails;
}
