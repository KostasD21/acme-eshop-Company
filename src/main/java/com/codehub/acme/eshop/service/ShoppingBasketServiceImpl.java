package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.domain.User;
import com.codehub.acme.eshop.repository.ShoppingBasketRepository;
import com.codehub.acme.eshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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

    @Autowired
    private UserRepository userRepository;
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
    public Optional<ShoppingBasket> findByUserId(Long userId) {
        return shoppingBasketRepository.findByUserId(userId);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket addProducts(List<ProductItem> productItems) {
        /* TODO: 1. AUTHENTICATE USER, USER DOMAIN*/
        /* TODO: 2. GET SHOPPING BASKET BY USER ID*/
        ShoppingBasket newshoppingBasket = null;
        Optional<ShoppingBasket> shoppingBasket = findByUserId(1L);

        /* TODO: 3. CHECK IF SHOPPING BASKET EXIST */
        if (shoppingBasket == null){
            shoppingBasketRepository.save(new ShoppingBasket(1L, productItems, calculateTotalAmount(productItems),userRepository.findById(1L).get()));
        }else{
            shoppingBasket.get().setProductItems(productItems);
            shoppingBasket.get().setTotalAmount(calculateTotalAmount(productItems));
            newshoppingBasket = shoppingBasketRepository.save(shoppingBasket.get());
        }
        /* TODO: 3.1. IF YES, ADD THE PRODUCTS_ITEMS */
        /* TODO: 3.2. ELSE CREATE SHOPPING BASKET AND ADD */
        return newshoppingBasket;
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

    private BigDecimal calculateTotalAmount(List<ProductItem> productItems){
        BigDecimal totalAmount = new BigDecimal(0);
        for (ProductItem productItem : productItems){
            totalAmount = totalAmount.add(productItem.getAmount());
        }
        return totalAmount;
    }
}