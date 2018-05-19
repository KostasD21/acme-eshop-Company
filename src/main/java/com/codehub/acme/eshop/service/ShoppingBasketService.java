package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ShoppingBasket;

import java.util.List;

/**
 * This interface contains the signatures of methods regarding the {@link com.codehub.acme.eshop.domain.ShoppingBasket} functionality
 */
public interface ShoppingBasketService {
    /**
     * This method finds the shopping basket by ID
     *
     * @param shoppingBasketId the ID of the shopping basket
     * @return                 the {@link ShoppingBasket}
     */
    ShoppingBasket findById(Long shoppingBasketId);
    /**
     * This method finds the shopping basket by user ID
     *
     * @param userId           the user ID
     * @return                 the {@link ShoppingBasket}
     */
    ShoppingBasket findByUserId(Long userId);
    /**
     * This method adds a list of products to the shopping basket
     *
     * @param shoppingBasketId the ID of the shopping basket
     * @param productList      the {@link List} of {@link Product}
     * @return                 the {@link List} of added {@link Product}
     */
    List<Product> addProducts(Long shoppingBasketId, List<Product> productList);
    /**
     * This method removes a list of products from shopping basket
     *
     * @param shoppingBasketId the ID of the shopping basket
     * @param productList      the {@link List} of {@link Product}
     */
    void removeProducts(Long shoppingBasketId, List<Product> productList);
    /**
     * This method updates the shopping basket
     *
     * @param shoppingBasketId the shopping basket ID
     * @param productList      the {@link List} of {@link Product}
     * @return                 the {@link List} of updated {@link Product}
     */
    ShoppingBasket updateShoppingBasket(Long shoppingBasketId, List<Product> productList);
}