package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.Availability;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * This domain refers to the product's stock
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductStock {
    /**
     * the product stock id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "PRODUCT_STOCK_ID",nullable = false)
    private Long id;

    /**
     * the product stock available
     */
    private Long stock;

    /**
     * the {@link Availability} of product
     */
    @Enumerated(EnumType.STRING)
    private Availability availability;
}
