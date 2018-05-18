package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * This service contains the implementation of methods regarding the {@link UserOrder} functionality
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public void submitOrder() {
    orderRepository.save(new UserOrder(1L, new Date(), null));
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
    public UserOrder findOrderById(Long orderId) {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public UserOrder findOrderByUserId(Long userId) {
        return null;
    }
}
