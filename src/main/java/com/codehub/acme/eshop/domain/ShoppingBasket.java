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
@Entity
public class ShoppingBasket {
    /**
     * The shopping id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  @Column(name = "SHOPPING_BASKET_ID", nullable = false)
    private Long Id;
    /**
     * a {@link List} of {@link Product}
     */
    @OneToMany(mappedBy = "shoppingBasket")
    //  @JoinColumn(name="PRODUCT_ID", referencedColumnName="PRODUCT_ID")
    private List<Product> products = new ArrayList<>();
    /**
     * the total amount
     */
    private BigDecimal totalAmount;
    /**
     * the user id
     */
    @OneToOne
    //  @JoinColumn(name = "USER_ID")
    private User userId;


    public ShoppingBasket(){}

    public ShoppingBasket(Long id, List<Product> products, BigDecimal totalAmount, User userId) {
        Id = id;
        this.products = products;
        this.totalAmount = totalAmount;
        this.userId = userId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
