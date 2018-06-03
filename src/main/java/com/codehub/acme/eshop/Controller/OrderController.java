package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.BillingDetails;
import com.codehub.acme.eshop.domain.Purchase;
import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.service.OrderService;
import com.codehub.acme.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * This controller handles the requests for the {@link UserOrder}
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;

    /**
     * This method adds products to the shopping basket
     *
     * @param order the order to be submitted
     * @return the submitted order
     */
    @PostMapping("/orders")
    public UserOrder submitOrder(@Valid @RequestBody UserOrder order){
        /* TODO: Product Items cannot be null */
        /* TODO: Billing details can be null in case that the user is authenticated */
        order.setBillingDetails(new BillingDetails(userService.getUserInfo(1L).getAddress(),userService.getUserInfo(3L).getPostCode(), order.getBillingDetails().getShippingMethod(), order.getBillingDetails().getReceiptMethod(), order.getBillingDetails().getPaymentMethod()));
        //order.setUser(user);
        return orderService.submitOrder(order);
    }

}
