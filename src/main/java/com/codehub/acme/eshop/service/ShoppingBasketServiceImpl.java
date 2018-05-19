package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service contains the implementation of methods regarding the {@link com.codehub.acme.eshop.domain.ShoppingBasket} functionality
 */
@Service
public class ShoppingBasketServiceImpl implements ShoppingBasketService {
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket findSBasketById(Long sBasketId) {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket findSBasketByUserId(Long userId) {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void addProductsToSBasket(List<Product> productList) {

    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void removeProductsFromSBasket(Long userId) {

    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void updateSBasket(Long sBasketId) {

    }
}
