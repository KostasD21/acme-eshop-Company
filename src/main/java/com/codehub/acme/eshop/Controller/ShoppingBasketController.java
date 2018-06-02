package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.exception.NotFoundException;
import com.codehub.acme.eshop.service.ShoppingBasketService;
import com.codehub.acme.eshop.service.UserService;
import com.codehub.acme.eshop.transformation.ShoppingBasketDto;
import com.codehub.acme.eshop.transformation.service.TransformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This controller is responsible to handle requests regarding the {@link ShoppingBasket} functionality
 */
@RestController
public class ShoppingBasketController {

    /**
     * {@link ShoppingBasketService}
     */
    @Autowired
    private ShoppingBasketService shoppingBasketService;

    /**
     * {@link TransformationService}
     */
    @Autowired
    private TransformationService transformationService;

    @Autowired
    private UserService userService;

    /**
     * The default URL for all the methods
     */
    private static final String DEFAULT_RESOURCE = "/shoppingBasket/";

    /**
     * This method searches and returns a {@link ShoppingBasket} for a given user Id
     *
     * @param userId the user Id
     * @return {@link ShoppingBasket}
     */
    @GetMapping(DEFAULT_RESOURCE + "users/{userId}")
    public ShoppingBasketDto getShoppingBasketByUserId(@PathVariable Long userId, @RequestHeader String token) {

        userService.authenticate(token);

        ShoppingBasket shoppingBasket = shoppingBasketService.findByUserId(userId);
        if (shoppingBasket == null) {
            throw new NotFoundException("The shopping basket for the user Id " + userId + " not found");
        }
        return new ShoppingBasketDto(shoppingBasket.getId(), transformationService.transformProductItems(shoppingBasket.getProductItems()), shoppingBasket.getTotalAmount(), shoppingBasket.getUser());
    }

    /**
     * This method adds products to the shopping basket
     *
     * @param products the {@link List} of {@link Product}
     * @return the created/updated {@link ShoppingBasket}
     */
    @PostMapping(DEFAULT_RESOURCE + "addProducts")
    public ShoppingBasketDto addProductsToShoppingBasket(@RequestBody List<Product> products, @RequestHeader String token){

        userService.authenticate(token);

        /* TODO: Validate the amount of product items > 0 */
        ShoppingBasket shoppingBasket = shoppingBasketService.addProducts(products);
        /* FIXME: Display the Product information properly in the response */
        return new ShoppingBasketDto(shoppingBasket.getId(), transformationService.transformProductItems(shoppingBasket.getProductItems()), shoppingBasket.getTotalAmount(), shoppingBasket.getUser());
    }

    /**
     * This method updates a the quantities of product items included into a shopping basket
     *
     * @param shoppingBasketId the shopping basket Id
     * @param productItems the {@link List} of {@link ProductItem}
     * @return the updated {@link ShoppingBasket}
     */
    @PutMapping(DEFAULT_RESOURCE + "{shoppingBasketId}/updateProducts")
    public ShoppingBasketDto updateProductQuantities(@PathVariable Long shoppingBasketId, @RequestBody List<ProductItem> productItems,
                                                     @RequestHeader String token){
        userService.authenticate(token);

        /* TODO: Validate the quantities of product items > 0 && quantity <= 30 */
        ShoppingBasket shoppingBasket = shoppingBasketService.findById(shoppingBasketId);
        if (shoppingBasket == null) {
            throw new NotFoundException("The shopping basket with Id " + shoppingBasketId + " not found");
        }
        shoppingBasket = shoppingBasketService.updateShoppingBasket(shoppingBasket, productItems);
        return new ShoppingBasketDto(shoppingBasket.getId(), transformationService.transformProductItems(shoppingBasket.getProductItems()), shoppingBasket.getTotalAmount(), shoppingBasket.getUser());
    }

    /**
     * This method deletes a product item from the shopping basket
     *
     * @param shoppingBasketId the shopping basket Id
     * @param productItemId the product item Id
     * @return the updated {@link ShoppingBasket}
     */
    @DeleteMapping(DEFAULT_RESOURCE + "{shoppingBasketId}/removeProduct/{productItemId}")
    public ShoppingBasketDto removeProduct(@PathVariable Long shoppingBasketId, @PathVariable Long productItemId, @RequestHeader String token){

        userService.authenticate(token);

        if (!shoppingBasketService.exists(shoppingBasketId)) {
            throw new NotFoundException("The shopping basket with Id " + shoppingBasketId + " not found");
        }
        ShoppingBasket shoppingBasket = shoppingBasketService.removeProductItem(shoppingBasketId, productItemId);
        return new ShoppingBasketDto(shoppingBasket.getId(), transformationService.transformProductItems(shoppingBasket.getProductItems()), shoppingBasket.getTotalAmount(), shoppingBasket.getUser());
    }
}
