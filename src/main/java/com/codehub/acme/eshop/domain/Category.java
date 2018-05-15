package com.codehub.acme.eshop.domain;

import jdk.Exported;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import java.util.List;

//MANY TO ONE RELATIONSHIP WITH PRODUCTS //
@Component
public class Category {
    // UNIQUE ID TOU DOMAIN GIA THN DATABASE //
    private Long Id;
    private String categoryName;
    private List<Product> products;


    public Category() {}

    public Category(Long id, String categoryName, List<Product> products) {
        Id = id;
        this.categoryName = categoryName;
        this.products = products;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}