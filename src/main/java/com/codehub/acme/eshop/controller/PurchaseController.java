package com.codehub.acme.eshop.controller;

import com.codehub.acme.eshop.domain.Purchase;
import com.codehub.acme.eshop.service.PurchaseService;
import com.codehub.acme.eshop.service.UserService;
import com.codehub.acme.eshop.transformation.PurchaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


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
     * This method completes a purchase
     *
     * @param purchase the purchase
     * @return the created/updated {@link Purchase}
     */
    @PostMapping("/purchase")
    public PurchaseDto completePurchase(@Valid @RequestBody Purchase purchase, @RequestHeader String token){
        userService.authenticate(token);
        return new PurchaseDto(purchaseService.completePurchase(purchase));
    }

    /**
     * This method cancels a purchase
     * @param id of the {@link Purchase}
     * @param token 
     * @return
     */
    @PostMapping(value = "/cancel/{id}")
    public ResponseEntity<PurchaseDto> cancelPurchase(@PathVariable Long id, @RequestHeader String token){
        userService.authenticate(token);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new PurchaseDto(purchaseService.cancelPurchase(id)));
    }

}
