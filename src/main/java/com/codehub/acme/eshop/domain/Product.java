package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.Availability;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * This domain class represents a shopping basket
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
    private Long Id;
    /**
     * the title
     */
    private String title;
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
    private Long stock;
    /**
     * the {@link Availability}
     */
    private Availability availability;
    /**
     * the {@link Category}
     */
    @OneToMany
    @JoinColumn(name="CATEGORY_ID", referencedColumnName="CATEGORY_ID")
    private Category category;
    /**
     * the price
     */
    private Double price;
    
}
