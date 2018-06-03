package com.codehub.acme.eshop.controller;

import com.codehub.acme.eshop.domain.Purchase;
import com.codehub.acme.eshop.service.PurchaseService;
import com.codehub.acme.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * This controller handles the request for the {@link Purchase}
 */
@RestController
public class PurchaseController {

    /**
     * {@link PurchaseService}
     */
    @Autowired
    private PurchaseService purchaseService;
    /**
     * {@link UserService}
     */
    @Autowired
    private UserService userService;

    /**
     * This method completes a purcahse
     *
     * @param orderId the order Id
     * @param purchase the purchase
     * @return the created/updated {@link Purchase}
     */
    @PostMapping("/purchase/{orderId}")
    public Purchase completePurchase(@PathVariable Long orderId, @RequestBody Purchase purchase, @RequestHeader String token){
        userService.authenticate(token);
        return purchaseService.completePurchase(orderId, purchase);
    }
}
