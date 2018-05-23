package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.Availability;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private Long id;

    /**
     * the product stock available
     */
    private Long stock;

    /**
     * the {@link Availability} of product
     */
    private Availability availability;
}
