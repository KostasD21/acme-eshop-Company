package com.codehub.acme.eshop.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This domain class represents a category of products
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category{
    /**
     * the category id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * the name of the category
     */
    private String name;
    /**
     * the description of the category
     */
    private String description;
    /**
     * a {@link List} of {@link Product}
     */
    @OneToMany
    @JoinTable(name = "category_products",joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name ="category_id"))
    private List<Product> products = new ArrayList<>();
}