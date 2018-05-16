package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Order;

/**
 * This interface contains the signatures of methods regarding the {@link com.codehub.acme.eshop.domain.Order} functionality
 */
public interface OrderService {
    /**
     * This method creates an order
     */
    void submitOrder();
    /**
     * This method cancels the order
     *
     * @param orderId the order ID
     */
    void cancelOrder(Long orderId);
    /**
     * This method finds the order by order ID
     *
     * @param orderId the order ID
     * @return        the {@link Order}
     */
    Order findOrderById(Long orderId);
    /**
     * This method finds the order by user ID
     *
     * @param userId  the user ID
     * @return        the {@link Order}
     */
    Order findOrderByUserId(Long userId);
}
