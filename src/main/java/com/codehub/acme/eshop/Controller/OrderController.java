package com.codehub.acme.eshop.Controller;


import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "orders")
public class OrderController {

    /**
     * {@link OrderService}
     */
    @Autowired
    private OrderService orderService;

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

}
