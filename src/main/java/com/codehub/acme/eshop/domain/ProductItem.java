package com.codehub.acme.eshop.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

/**
 * This domain represents a product of a shopping basket
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCT_ITEM")
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
    @Min(value = 1)
    @Max(value = 30)
    private Integer quantity;

    /**
     * the amount to be paid for the product item
     */
    private BigDecimal amount;

    /**
     * the shopping basket that corresponds to the product item
     */
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="SHOPPING_BASKET_ID")
    //@JsonBackReference
    private ShoppingBasket shoppingBasket;

    /**
     * the order that corresponds to the product item
     */
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="ORDER_ID")
    private UserOrder order;

    /**
     * the product that corresponds to the product item
     */
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name="PRODUCT_ID")
    //@JsonManagedReference
    private Product product;

    /**
     * Constructor with all attributes except the unique id
     *
     * @param quantity the quantity of the product item
     * @param amount  the amount of the product item
     * @param shoppingBasket the correlated {@link ShoppingBasket}
     * @param order the correlated {@link UserOrder}
     * @param product the correlated product {@link Product}
     */
    public ProductItem(Integer quantity, BigDecimal amount, ShoppingBasket shoppingBasket, UserOrder order, Product product) {
        this.quantity = quantity;
        this.amount = amount;
        this.shoppingBasket = shoppingBasket;
        this.order = order;
        this.product = product;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new StringBuilder("ProductItem{")
                .append("id=").append(id)
                .append(", quantity=").append(quantity)
                .append(", amount=").append(amount)
                .append(", shoppingBasket=").append(shoppingBasket)
                .append(", order=").append(order)
                .append(", product=").append(product)
                .append('}').toString();
    }
}
