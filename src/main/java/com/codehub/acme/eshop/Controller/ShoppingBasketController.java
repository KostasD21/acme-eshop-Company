package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShoppingBasketController {
    /**
     * {@link ShoppingBasketService}
     */
    @Autowired
    private ShoppingBasketService shoppingBasketService;

    /**
     * This method searches and returns a {@link ShoppingBasket} regarding a given user Id
     * @return {@link ShoppingBasket}
     */
    @GetMapping("/shoppingBasket/users/{userId}")
    public Optional<ShoppingBasket> getShoppingBasketByUserId(@PathVariable Long userId) {
        return shoppingBasketService.findByUserId(userId);
    }

    @PostMapping("/shoppingBasket/addProducts")
    public ShoppingBasket addProductsToShoppingBasket(@RequestBody List<ProductItem> productItems){
        return shoppingBasketService.addProducts(productItems);
    }

}
