package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ProductStock;
import com.codehub.acme.eshop.domain.ShoppingBasket;

import java.util.List;

/**
 * This interface contains all the signatures of methods regarding the {@link Product} functionality
 */
public interface ProductService {

    /**
     * This method adds a product
     *
     * @param product the product
     * @return the added product
     */
    Product addProduct(Product product);

    /**
     * This method finds a {@link Product} by the ID
     *
     * @param id of the Product
     * @return a Product object
     */
    Product findProductById(Long id);

    /**
     * This method finds a {@link Product} by it's name
     *
     * @param name of the Product
     * @return a Product object
     */
    Product findProductByTitle(String name);

    /**
     * This method finds the list of{@link Product} per category Id
     *
     * @param categoryId
     * @return
     */
    List<Product> getAllProducts(Long categoryId);

    /**
     * This method gets all the products
     * @return a {@link List} of {@link Product}
     */
    List<Product> findAllProducts();


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
     * This method updates a product item
     *
     * @param productsItem the product item to be saved
     * @return  the updated product item
     */
    ProductItem updateProductItem(ProductItem productsItem);

    void checkAvailability(ProductStock productStock);

    ProductItem getProductItem(ProductItem productItem);

    /**
     * This method saves a product
     *
     * @param product the product
     * @return the saved/updated product
     */
    Product save(Product product);
}

