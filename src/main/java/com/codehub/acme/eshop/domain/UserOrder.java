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
    private BillingDetails billingDetails;
}