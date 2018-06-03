package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.Purchase;
import com.codehub.acme.eshop.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


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
     * This method completes a purcahse
     *
     * @param orderId the order Id
     * @param purchase the purchase
     * @return the created/updated {@link Purchase}
     */
    @PostMapping("/purchase/{orderId}")
    public Purchase completePurchase(@PathVariable Long orderId, @RequestBody Purchase purchase){
        return purchaseService.completePurchase(orderId, purchase);
    }
}
