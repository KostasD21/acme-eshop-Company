package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.Availability;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
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
    @Column(name = "PRODUCT_ID", nullable = false)
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
    @ManyToOne(optional = false)
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
     private Category category;
    /**
     * the price
     */
    private BigDecimal price;
    /**
     * the {@link List} of {@link ProductItem}
     */
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
  // @JsonBackReference
    @JsonIgnore
    private List<ProductItem> productItems;
}