package com.codehub.acme.eshop.domain;


import com.codehub.acme.eshop.enumerator.Provider;
import com.codehub.acme.eshop.enumerator.PurchaseStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * This domain class represents a purchase
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PURCHASE")
@Entity
public class Purchase {
    /**
     * the purchase id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @NotNull
    private UserOrder order;
    /**
     * Reference id regarding the unique ID that we receive from the provider
     */
    private String referenceId;
    /**
     * The type of provider
     * {@link Provider}
     */
    @Enumerated(EnumType.STRING)
    private Provider provider;
    /**
     * Total amount of the purchase
     */
    @Min(value = 1)
    private BigDecimal amount;
    /**
     * The status of the purchase
     * {@link PurchaseStatus}
     */
    @Enumerated(EnumType.STRING)
    private PurchaseStatus purchaseStatus;

    /**
     * Constructor with all attributes except the unique id
     *
     * @param purchaseDate the purchase date
     * @param order the order
     * @param referenceId the referenceId of the provider
     * @param provider the provider that we communicate for the payment
     * @param amount the total purchase amount
     * @param purchaseStatus the purchase status
     */
    public Purchase(Date purchaseDate, UserOrder order, String referenceId, Provider provider, BigDecimal amount, PurchaseStatus purchaseStatus) {
        this.purchaseDate = purchaseDate;
        this.order = order;
        this.referenceId = referenceId;
        this.provider = provider;
        this.amount = amount;
        this.purchaseStatus = purchaseStatus;
    }
}
