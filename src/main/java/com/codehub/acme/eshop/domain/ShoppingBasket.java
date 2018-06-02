package com.codehub.acme.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * This domain class represents a shopping basket
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SHOPPING_BASKET")
@Entity
public class ShoppingBasket {
    /**
     * The shopping basket id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHOPPING_BASKET_ID",nullable = false)
    private Long id;
    /**
     * a {@link List} of {@link ProductItem}
     */
    @OneToMany(mappedBy = "shoppingBasket")
    private List<ProductItem> productItems = new ArrayList<>();
    /**
     * the total amount
     */
    private BigDecimal totalAmount;
    /**
     * the user id
     */
    @OneToOne
    private User user;
}
