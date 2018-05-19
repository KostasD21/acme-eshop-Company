package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.Availability;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This domain class represents a product
 */
@Entity
public class Product {
    /**
     * the product id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//@Column(name = "PRODUCT_ID", nullable = false)
    private Long Id;
    /**
     * the title
     */
    private String title;
    /**
     * the shopping Basket
     */
    @ManyToOne
    private ShoppingBasket shoppingBasket;
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
     * the quantity of product
     */
    private Long quantity;
    /**
     * the stock available
     */
    private Long stock;
    /**
     * the {@link Availability}
     */
    private Availability availability;
    /**
     * the {@link Category}
     */
//@JoinColumn(name="CATEGORY_ID", referencedColumnName="CATEGORY_ID")
    @ManyToMany(mappedBy = "products")
    private List<Category> categories= new ArrayList<>();
    /**
     * the price
     */
    private Double price;

    public Product(){}

    public Product(Long id, String title, ShoppingBasket shoppingBasket, String shortDescription, String longDescription,
                   String productCode, Long quantity, Long stock, Availability availability,
                   List<Category> categories, Double price) {
        Id = id;
        this.title = title;
        this.shoppingBasket = shoppingBasket;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.productCode = productCode;
        this.quantity = quantity;
        this.stock = stock;
        this.availability = availability;
        this.categories = categories;
        this.price = price;
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

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ShoppingBasket getShoppingBasket() {
        return shoppingBasket;
    }

    public void setShoppingBasket(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }
}