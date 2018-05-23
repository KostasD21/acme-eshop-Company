package com.codehub.acme.eshop.domain;


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
    private Long id;

    /**
     * the quantity of the product item
     */
    private Integer quantity;

    /**
     * the amount to be paid for the product item
     */
    private BigDecimal productItemAmount;

    /**
     * the shopping Basket that corresponds to the product item
     */
    @ManyToOne//(optional=false)
    @JoinColumn( name="SHOPPING_BASKET_ID")
    private ShoppingBasket shoppingBasket;

    /**
     * the order that corresponds to the product item
     */
    @ManyToOne
    private UserOrder order;

    /**
     * the product that corresponds to the product item
     */
    @OneToOne
    private Product products;
}
