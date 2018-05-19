package com.codehub.acme.eshop.domain;


import com.codehub.acme.eshop.enumerator.Provider;
import com.codehub.acme.eshop.enumerator.PurchaseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * This domain class represents a purchase
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Purchase {
    /**
     * the purchase id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PURCHASE_ID", nullable = false)
    private Long id;
    /**
     * the purchase date
     */
    private Date purchaseDate;
    /**
     * the {@link UserOrder}
     */
    @OneToOne(optional=false)
    @JoinColumn(name = "ORDER_ID")
    private UserOrder orderDetails;
    /**
     * Reference id regarding the unique ID that we receive from the provider
     */
    private String referenceId;
    /**
     * The type of provider
     * {@link Provider}
     */
    private Provider provider;
    /**
     * Total amount of the purchase
     */
    private BigDecimal amount;
    /**
     * The status of the purchase
     * {@link PurchaseStatus}
     */
    private PurchaseStatus purchaseStatus;
}
