package com.codehub.acme.eshop.domain;
//MANY TO ONE RELATIONSHIP WITH PRODUCTS //
public class Category {
    // UNIQUE ID TOU DOMAIN GIA THN DATABASE //
    private Long Id;
    private String categoryName;
    private Product product;

    public Category(){}

    public Category(Long id, String categoryName, Product product) {
        Id = id;
        this.categoryName = categoryName;
        this.product = product;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
