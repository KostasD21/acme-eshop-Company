package com.codehub.acme.eshop.transformation.service;

import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.transformation.ProductItemDto;

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
}
