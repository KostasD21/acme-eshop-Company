package com.codehub.acme.eshop.domain;

import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * This domain class represents a product
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "PRODUCT")
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
    @OneToOne(fetch = FetchType.EAGER)
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
    @Min(value = 1)
    private BigDecimal price;
    /**
     * the {@link List} of {@link ProductItem}
     */
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
  // @JsonBackReference
    @JsonIgnore
    private List<ProductItem> productItems;
}