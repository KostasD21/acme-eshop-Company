package com.codehub.acme.eshop.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

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
public class Category {
    /**
     * the category id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID",nullable = false)
    private Long id;
    /**
     * the name of the category
     */
    @Column(name = "CATEGORY_NAME")
    private String name;
    /**
     * the description of the category
     */
    private String description;
    /**
     * a {@link List} of {@link Product}
     */
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToMany(mappedBy = "category",targetEntity = Product.class)
    @JsonIgnore
    private List<Product> products = new ArrayList<>();

}