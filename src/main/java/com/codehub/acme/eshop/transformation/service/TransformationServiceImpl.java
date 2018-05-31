package com.codehub.acme.eshop.transformation.service;

import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.transformation.ProductItemDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This service contains the implementation of methods regarding the transformation of domain objects to Dto
 */
@Service
public class TransformationServiceImpl implements TransformationService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ProductItemDto> transformProductItems(List<ProductItem> productItems) {
        List<ProductItemDto> productItemDtos = new ArrayList<>();
        for (ProductItem productItem : productItems) {
            productItemDtos.add(new ProductItemDto(productItem.getId(), productItem.getQuantity(), productItem.getAmount(), productItem.getShoppingBasket(), productItem.getOrder(), productItem.getProduct()));
        }
        return productItemDtos;
    }
}
