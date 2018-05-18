package com.codehub.acme.eshop.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This domain class represents a category of products
 */
@Entity
public class Category{
    /**
     * the category id
     */
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @OneToMany
    @JoinTable(name = "category_products",joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name ="category_id"))
    private List<Product> products = new ArrayList<>();

    public Category(){};

    public Category(Long id, String name, String description, List<Product> products) {
        Id = id;
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}