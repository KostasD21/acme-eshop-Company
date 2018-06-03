package com.codehub.acme.eshop.transformation.service;

import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.transformation.ProductItemDto;
import com.codehub.acme.eshop.transformation.UserOrderDto;

import java.util.List;

/**
 * This service contains the signature of methods regarding the transformation of domain objects to Dto
 */
public interface TransformationService {

    /**
     * This method transforms a {@link ProductItem} to {@link ProductItemDto}
     *
     * @param productItems the {@link List} of {@link ProductItem}
     * @return the {@link List} of {@link ProductItemDto}
     */
    List<ProductItemDto> transformProductItems(List<ProductItem> productItems);

    /**
     * This method transforms a {@link UserOrder} to {@link UserOrderDto}
     *
     * @param userOrders the {@link List} of {@link UserOrder}
     * @return the {@link List} of {@link UserOrderDto}
     */
    List<UserOrderDto> transformUserOrders(List<UserOrder> userOrders);
}
