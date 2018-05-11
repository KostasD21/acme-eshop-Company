package com.codehub.acme.eshop.domain;

// ONE TO MANY RELATIONSHIP ME TO CATEGORY DOMAIN //
//MANY TO ONE RELATIONSHIP ME TON SHOPPING_BASKET DOMAIN//
//MANY TO ONE RELATIONSHIP ME TO ORDER DOMAIN //


import com.codehub.acme.eshop.enumerator.Availability;

public class Product {
    // UNIQUE ID TOU DOMAIN GIA THN DATABASE //
    private Long Id;

    private String title;
    private String shortDescription;
    private String longDescription;
    private String productCode;
    private Long quantity;
    private Long stock;

    // OPTIONAL PREPEI NA SYZHTHSOUME PWS THA TO XRHSIMOPOIHSOYME //
    private Availability availability;
    /**
     * {@link Category}
     */
    private Category category;
    private Double price;

    public Product(){}

    public Product(Long id, String title, String shortDescription, String longDescription,
                   String productCode, Long quantity,
                   Availability availability, Category category, Double price,Long stock) {
        Id = id;
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.productCode = productCode;
        this.quantity = quantity;
        this.availability = availability;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }



    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }
}
