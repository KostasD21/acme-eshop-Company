package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.repository.ShoppingBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service contains the implementation of methods regarding the {@link ShoppingBasket} functionality
 */
@Service
public class ShoppingBasketServiceImpl implements ShoppingBasketService {
    /**
     * {@link ShoppingBasketRepository}
     */
    @Autowired
    private ShoppingBasketRepository shoppingBasketRepository;
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket findById(Long sBasketId) {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket findByUserId(Long userId) {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> addProducts(Long shoppingBasketId, List<Product> productList) {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void removeProducts(Long shoppingBasketId, List<Product> productList) {

    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket updateShoppingBasket(Long shoppingBasketId, List<Product> productList) {
        return null;
    }
}