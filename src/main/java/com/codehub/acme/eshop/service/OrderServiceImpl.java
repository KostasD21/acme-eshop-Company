package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Order;
import org.springframework.stereotype.Service;

/**
 * This service contains the implementation of methods regarding the {@link Order} functionality
 */
@Service
public class OrderServiceImpl implements OrderService {
    /**
     * {@inheritDoc}
     */
    @Override
    public void submitOrder() {

    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void cancelOrder(Long orderId) {

    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Order findOrderById(Long orderId) {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Order findOrderByUserId(Long userId) {
        return null;
    }
}
