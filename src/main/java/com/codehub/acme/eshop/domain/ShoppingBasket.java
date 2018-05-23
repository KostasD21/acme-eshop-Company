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
     * The shopping basket id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * a {@link List} of {@link ProductItem}
     */
    @OneToMany(mappedBy = "shoppingBasket")
    //  @JoinColumn(name="PRODUCT_ID", referencedColumnName="PRODUCT_ID")
    private List<ProductItem> productsItems;// = new ArrayList<>();
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
