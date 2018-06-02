package com.codehub.acme.eshop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * This domain class represents a shopping basket
 */
@Data
@NoArgsConstructor
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
    @OneToMany(mappedBy = "shoppingBasket", fetch = FetchType.EAGER)
    //@JsonManagedReference
    @JsonIgnore
    private List<ProductItem> productItems = new ArrayList<>();
    /**
     * the total amount
     */
    private BigDecimal totalAmount;
    /**
     * the user id
     */
    @OneToOne(fetch = FetchType.LAZY)
    //@JsonManagedReference
    private User user;

    /**
     * Constructor with all attributes except the unique id
     *
     * @param productItems a {@link List} of {@link ProductItem}
     * @param totalAmount the total amount of the basket
     * @param user the correlated {@link User}
     */
    public ShoppingBasket(List<ProductItem> productItems, BigDecimal totalAmount, User user) {
        this.productItems = productItems;
        this.totalAmount = totalAmount;
        this.user = user;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new StringBuilder("ShoppingBasket{")
                .append("id=").append(id)
                .append(", productItems=").append(productItems)
                .append(", totalAmount=").append(totalAmount)
                .append(", user=").append(user)
                .append('}').toString();
    }
}
