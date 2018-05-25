package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.Availability;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This domain class represents a product
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    /**
     * the product id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;
    /**
     * the title
     */
    private String title;
    /**
     * the shopping Basket
     */
    @ManyToOne
    private ShoppingBasket shoppingBasket;
    /**
     * the short description
     */
    private String shortDescription;
    /**
     * the long description
     */
    private String longDescription;
    /**
     * the product description
     */
    private String productCode;
    /**
     * the quantity of product
     */
    private Long quantity;
    /**
     * the stock available
     */

    @OneToOne
    private ProductStock stock;
    /**
     * the {@link Availability}
     */
    private Availability availability;
    /**
     * the {@link Category}
     */
    @ManyToOne(optional = false)
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
    @JsonManagedReference
    private Category category;
    /**
     * the price
     */
    private Double price;
}