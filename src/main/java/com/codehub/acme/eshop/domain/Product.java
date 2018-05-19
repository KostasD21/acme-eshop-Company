package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.Availability;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
//@JoinColumn(name="CATEGORY_ID", referencedColumnName="CATEGORY_ID")
    @ManyToMany(mappedBy = "products")
    private List<Category> categories= new ArrayList<>();
    /**
     * the price
     */
    private Double price;
}