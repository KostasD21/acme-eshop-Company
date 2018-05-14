package com.codehub.acme.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * This domain class represents a shopping basket
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ShoppingBasket {
    /**
     * The shopping id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SHOPPING_BASKET_ID", nullable = false)
    private Long Id;
    /**
     * a {@link List} of {@link Product}
     */
    @ManyToMany
    @JoinColumn(name="PRODUCT_ID", referencedColumnName="PRODUCT_ID")
    private List<Product> products;
    /**
     * the total amount
     */
    private BigDecimal totalAmount;
    /**
     * the user id
     */
    @OneToOne(optional=false)
    @JoinColumn(name = "USER_ID")
    private Long userId;
}
