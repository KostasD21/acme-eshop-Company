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
     * @param sBasketId        the ID of the shopping basket
     * @return                 the {@link ShoppingBasket}
     */
    ShoppingBasket findSBasketById(Long sBasketId);
    /**
     * This method finds the shopping basket by user ID
     *
     * @param userId           the user ID
     * @return                 the {@link ShoppingBasket}
     */
    ShoppingBasket findSBasketByUserId(Long userId);
    /**
     * This method finds the shopping basket by user ID
     *
     * @param productList      the {@link List} of {@link Product}
     * @return                 the {@link ShoppingBasket}
     */
    void addProductsToSBasket(List<Product> productList);
    /**
     * This method finds the shopping basket by user ID
     *
     * @param userId           the user ID
     * @return                 the {@link ShoppingBasket}
     */
    void removeProductsFromSBasket(Long userId);
    /**
     * This method updates the shopping basket
     *
     * @param sBasketId the shopping basket ID
     */
    void updateSBasket(Long sBasketId);
}
