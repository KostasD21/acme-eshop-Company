package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.BillingDetails;
import com.codehub.acme.eshop.domain.Purchase;
import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.codehub.acme.eshop.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * This controller handles the requests for the {@link UserOrder}
 */
@RestController
@RequestMapping(value = "orders")
public class OrderController {

    /**
     * {@link OrderService}
     */
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;

    /**
     * This Controller returns a list of {@link UserOrder}
     * @return a list of {@link UserOrder}
     */
    @GetMapping
    public ResponseEntity<List<UserOrder>> userOrderList(){
        List<UserOrder> userOrderList = orderService.findAllOrders();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userOrderList);
    }
    /**
     * This Controller deletes a {@link UserOrder} by a given id
     */
    // TODO: PROVLIMA ME FOREIGN KEY MALLON THA LITHEI ME DTOS //
    @DeleteMapping(value = "/{orderId}")
    public void deleteOrderById(@PathVariable Long orderId){
        orderService.deleteOrderById(orderId);
    }

    /**
     * This method adds products to the shopping basket
     *
     * @param order the order to be submitted
     * @return the submitted order
     */
    @PostMapping
    public UserOrder submitOrder(@Valid @RequestBody UserOrder order){
        /* TODO: Product Items cannot be null */
        /* TODO: Billing details can be null in case that the user is authenticated */
        order.setBillingDetails(new BillingDetails(userService.getUserInfo(1L).getAddress(),userService.getUserInfo(3L).getPostCode(), order.getBillingDetails().getShippingMethod(), order.getBillingDetails().getReceiptMethod(), order.getBillingDetails().getPaymentMethod()));
        //order.setUser(user);
        return orderService.submitOrder(order);
    }

}
