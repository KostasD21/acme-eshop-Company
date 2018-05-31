package com.codehub.acme.eshop.transformation;

import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingBasketDto {
    /**
     * The shopping basket id
     */
    private Long id;
    /**
     * a {@link List} of {@link ProductItemDto}
     */
    private List<ProductItemDto> productItems;
    /**
     * the total amount
     */
    private BigDecimal totalAmount;
    /**
     * the user id
     */
    @JsonIgnore
    private User user;

    /**
     * Constructor with all attributes
     *
     * @param id the id of the shopping basket
     * @param productItems the {@link List} of {@link ProductItem}
     * @param totalAmount the total amount to be paid
     * @param user {@link User}
     */
    public ShoppingBasketDto(Long id, List<ProductItemDto> productItems, BigDecimal totalAmount, User user) {
        this.id = id;
        this.productItems = productItems;
        this.totalAmount = totalAmount;
        this.user = user;
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
     * this method gets the productItems
     *
     * @return the productItems
     */
    public List<ProductItemDto> getProductItems() {
        return productItems;
    }

    /**
     * this method sets the productItems
     *
     * @param productItems the productItems
     */
    public void setProductItems(List<ProductItemDto> productItems) {
        this.productItems = productItems;
    }

    /**
     * this method gets the totalAmount
     *
     * @return the totalAmount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * this method sets the totalAmount
     *
     * @param totalAmount the totalAmount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * this method gets the user
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * this method sets the user
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }
}
