package com.codehub.acme.eshop.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * This domain represents a product of a shopping basket
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductItem {

    /**
     * the product item id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ITEM_ID",nullable = false)
    private Long id;

    /**
     * the quantity of the product item
     */
    private Integer quantity;

    /**
     * the amount to be paid for the product item
     */
    private BigDecimal amount;

    /**
     * the shopping Basket that corresponds to the product item
     */
    @ManyToOne
    @JoinColumn(name="SHOPPING_BASKET_ID")
    @JsonBackReference
    private ShoppingBasket shoppingBasket;

    /**
     * the order that corresponds to the product item
     */
    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private UserOrder order;

    /**
     * the product that corresponds to the product item
     */
    @ManyToOne
    @JoinColumn(name="PRODUCT_ID")
    @JsonManagedReference
    private Product product;
}
