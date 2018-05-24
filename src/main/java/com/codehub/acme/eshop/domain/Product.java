package com.codehub.acme.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
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
     * the stock available
     */
    @OneToOne
    private ProductStock productStock;
    /**
     * the {@link Category}
     */
//@JoinColumn(name="CATEGORY_ID", referencedColumnName="CATEGORY_ID")
    @ManyToMany(mappedBy = "products")
    private List<Category> categories= new ArrayList<>();
    /**
     * the price
     */
    private BigDecimal price;
    /**
     * the {@link List} of {@link ProductItem}
     */
    @OneToMany(mappedBy = "product")
    private List<ProductItem> productItems;
}