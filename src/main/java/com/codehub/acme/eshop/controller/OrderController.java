package com.codehub.acme.eshop.controller;

import com.codehub.acme.eshop.domain.BillingDetails;
import com.codehub.acme.eshop.domain.User;
import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.exception.TokenInvalidException;
import com.codehub.acme.eshop.service.OrderService;
import com.codehub.acme.eshop.transformation.UserOrderDto;
import com.codehub.acme.eshop.transformation.service.TransformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.codehub.acme.eshop.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
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

    /**
     * {@link UserService}
     */
    @Autowired
    private UserService userService;

    /**
     * {@link TransformationService}
     */
    @Autowired
    private TransformationService transformationService;

    /**
     * This Controller returns a list of {@link UserOrder}
     * @return a list of {@link UserOrder}
     */
    @GetMapping
    public ResponseEntity<List<UserOrderDto>> userOrderList(){
        List<UserOrderDto> userOrderList = transformationService.transformUserOrders(orderService.findAllOrders());
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userOrderList);
    }
    /**
     * This Controller deletes a {@link UserOrder} by a given id
     */
    // TODO: PROVLIMA ME FOREIGN KEY MALLON THA LITHEI ME DTOS //
    @DeleteMapping(value = "/{orderId}")
    public void deleteOrderById(@PathVariable Long orderId, @RequestHeader String token){
        userService.authenticate(token);
        orderService.deleteOrderById(orderId);
    }

    /**
     * This method adds products to the shopping basket
     *
     * @param order the order to be submitted
     * @return the submitted order
     */
    @PostMapping
    public UserOrder submitOrder(@Valid @RequestBody UserOrder order, @RequestHeader String token){
        try {
            /* If the user is registered and the billing details are null from the request,
             * then the address and post code are completed by the user's properties */
            User user = userService.authenticate(token);
            order.setBillingDetails(new BillingDetails(user.getAddress(),user.getPostCode(), order.getBillingDetails().getShippingMethod(), order.getBillingDetails().getReceiptMethod(), order.getBillingDetails().getPaymentMethod()));
            order.setUser(user);
        } catch (TokenInvalidException e) {
            if (token == null) {
                order.setBillingDetails(new BillingDetails(order.getBillingDetails().getAddress(),order.getBillingDetails().getPostCode(), order.getBillingDetails().getShippingMethod(), order.getBillingDetails().getReceiptMethod(), order.getBillingDetails().getPaymentMethod()));
            }
        }
        return orderService.submitOrder(order);
    }

    /**
     * This method adds products to the shopping basket
     *
     * @param token the token
     * @return the submitted order
     */
    @GetMapping(value = "byUser")
    public List<UserOrderDto> getOrders(@RequestHeader String token){
        User user = userService.authenticate(token);
        return transformationService.transformUserOrders(orderService.findOrdersByUserId(user.getId()));
    }
}
