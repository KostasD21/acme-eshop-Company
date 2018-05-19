package com.codehub.acme.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

/**
 * This domain class represents a category of products
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {
    /**
     * the category id
     */
    private Long Id;
    /**
     * the name of the category
     */
    private String name;
    /**
     * the description of the category
     */
    private String description;
    /**
     * the {@link Product}
     */

    private List<Product> products;
}