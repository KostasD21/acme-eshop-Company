package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * This interface contains all the signatures of methods regarding the {@link Product} functionality
 */
public interface ProductService {

    /**
     *This method adds a new Product
     *
     * @param title product title
     * @param shortDescription a short description for the product
     * @param longDescription a long description for the product
     * @param productCode a unique code for each product
     * @param quantity quantiy of the product
     * @param stock the amount of stock
     */
    void addProduct(String title, String shortDescription, String longDescription, String productCode, Long quantity, Long stock);

    /**
     * This method removes a Product
     *
     * @param id remove the product by ID
     */
    void removeProduct(Long id);

    /**
     * This method updates the details of the Product
     *
     * @param title product title
     * @param shortDescription a short description for the product
     * @param longDescription a long description for the product
     * @param productCode a unique code for each product
     * @param quantity of a producy
     * @param stock the amount of stock
     */
    void updateProductDetails(String title, String shortDescription, String longDescription, String productCode, Long quantity, Long stock);

    /**
     * This method finds a Product by the Category that it belongs
     *
     * @param id the name of the Category
     * @return a Product object
     */

    /**
     * This method finds a Product by the ID
     *
     * @param id of the Product
     * @return a Product object
     */
    Product findProductById(Long id);

    /**
     * This method finds a Product by it's name
     *
     * @param name of the Product
     * @return a Product object
     */
    Product findProductByName(String name);

    /**
     * This method finds the Products per category Id
     *
     * @param categoryId
     * @return
     */
    List<Product> getAllProducts(Long categoryId);

    /**
     * This method adds product items
     *
     * @param products the {@link List} of {@link Product}
     * @param shoppingBasket {@link ShoppingBasket}
     * @return the created {@link List} of {@link ProductItem}
     */
    List<ProductItem> addProductItems(List<Product> products, ShoppingBasket shoppingBasket);

    /**
     * This method remove a product item
     *
     * @param productItemId the product item id
     */
    void removeProductItem(Long productItemId);

    /**
     * This method updates the product items
     *
     * @param productsItems the {@link List} of {@link ProductItem}
     */
    Collection<ProductItem> updateProductItems(List<ProductItem> productsItems);

    /**
     * This method updates a product item
     *
     * @param productsItem the product item to be saved
     * @return  the updated product item
     */
    ProductItem updateProductItem(ProductItem productsItem);
}

