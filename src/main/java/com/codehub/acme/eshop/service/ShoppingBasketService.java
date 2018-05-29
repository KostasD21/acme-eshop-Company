package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.transformation.ShoppingBasketDto;

import java.util.List;
import java.util.Optional;

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
     * @param productItems     the {@link List} of {@link ProductItem}
     * @return                 the {@link ShoppingBasket}
     */
    ShoppingBasket addProducts(List<Product> products);
    /**
     * This method removes a product item from a shopping basket
     *
     * @param shoppingBasketId the ID of the shopping basket
     * @param productItemId    the product to be removed from the basket
     */
    ShoppingBasket removeProduct(Long shoppingBasketId, Long productItemId);
    /**
     * This method updates the shopping basket
     *
     * @param shoppingBasket the shopping basket {@link ShoppingBasket}
     * @param productItems the {@link List} of {@link ProductItem}
     * @return the updated {@link ShoppingBasket}
     */
    ShoppingBasket updateShoppingBasket(ShoppingBasket shoppingBasket, List<ProductItem> productItems);
}