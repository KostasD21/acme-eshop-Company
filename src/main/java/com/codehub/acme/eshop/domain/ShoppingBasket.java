package com.codehub.acme.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * This domain class represents a shopping basket
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SHOPPING_BASKET")
public class ShoppingBasket {
    /**
     * The shopping basket id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHOPPING_BASKET_ID", nullable = false)
    private Long id;
    /**
     * a {@link List} of {@link ProductItem}
     */
    @OneToMany(mappedBy = "shoppingBasket", cascade = CascadeType.ALL)
    //@JoinColumn(name="PRODUCT_ITEM_ID", referencedColumnName="ID")
    private Set<ProductItem> productsItems;// = new ArrayList<>();
    /**
     * the total amount
     */
    private BigDecimal totalAmount;
    /**
     * the user id
     */
    @OneToOne
    private User userId;
}
