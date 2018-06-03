package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.UserOrder;

import java.util.List;

/**
 * This interface contains the signatures of methods regarding the {@link UserOrder} functionality
 */
public interface OrderService {
    /**
     * This method creates an order
     * @param order
     * @return the submitted order
     */
    UserOrder submitOrder(UserOrder order);
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
     * @return the {@link UserOrder}
     */
    UserOrder findOrderById(Long orderId);

    /**
     * This method finds the order by user ID
     *
     * @param userId the user ID
     * @return the {@link UserOrder}
     */
    UserOrder findOrderByUserId(Long userId);
    /**
     * This method saves the order
     *
     * @param userOrder the order {@link UserOrder}
     * @return the saved/updates {@link UserOrder}
     */
    UserOrder saveOrder(UserOrder userOrder);

    /**
     * This method gets the List of Orders submitted
     *
     * @return the list of {@link UserOrder}
     */
    List<UserOrder> findAllOrders();

    /**
     * This method deletes an Order {@link UserOrder}
     */
    void deleteOrderById(Long id);

}