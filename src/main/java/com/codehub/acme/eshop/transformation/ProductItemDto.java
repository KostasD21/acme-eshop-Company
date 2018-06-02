package com.codehub.acme.eshop.transformation;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.domain.UserOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

/**
 * This is a data transfer object for the {@link ProductItem}
 */
public class ProductItemDto {

    /**
     * the product item id
     */
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
    @JsonIgnore
    private ShoppingBasket shoppingBasket;

    /**
     * the order that corresponds to the product item
     */
    @JsonIgnore
    private UserOrder order;

    /**
     * the product that corresponds to the product item
     */
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
    public ProductItemDto(Long id, Integer quantity, BigDecimal amount, ShoppingBasket shoppingBasket, UserOrder order, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.amount = amount;
        this.shoppingBasket = shoppingBasket;
        this.order = order;
        this.product = product;
    }

    /**
     * this method gets the id
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * this method sets the id
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * this method gets the quantity
     *
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * this method sets the quantity
     *
     * @param quantity the quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * this method gets the amount
     *
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * this method sets the amount
     *
     * @param amount the amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * this method gets the shoppingBasket
     *
     * @return the shoppingBasket
     */
    public ShoppingBasket getShoppingBasket() {
        return shoppingBasket;
    }

    /**
     * this method sets the shoppingBasket
     *
     * @param shoppingBasket the shoppingBasket
     */
    public void setShoppingBasket(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    /**
     * this method gets the order
     *
     * @return the order
     */
    public UserOrder getOrder() {
        return order;
    }

    /**
     * this method sets the order
     *
     * @param order the order
     */
    public void setOrder(UserOrder order) {
        this.order = order;
    }

    /**
     * this method gets the product
     *
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * this method sets the product
     *
     * @param product the product
     */
    public void setProduct(Product product) {
        this.product = product;
    }
}
