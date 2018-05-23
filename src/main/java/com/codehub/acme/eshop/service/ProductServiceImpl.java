package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * This Service contains all the implementations of methods regarding the {@link Product} functionality
 */

@Service
public class ProductServiceImpl implements ProductService  {

    @Autowired
    private ProductItemRepository productItemRepository;

    public void save() {
        ProductItem productItem = new ProductItem(1L,1,new BigDecimal(20), null, null, null);
        productItemRepository.save(productItem);
    }

    /**
     *  {inheritDoc}
     */
    @Override
    public void addProduct(String title, String shortDescription, String longDescription, String productCode, Long quantity, Long stock) {

    }

    /**
     *  {inheritDoc}
     */
    @Override
    public void removeProduct(Long id) {

    }

    /**
     *  {inheritDoc}
     */
    @Override
    public void updateProductDetails(String title, String shortDescription, String longDescription, String productCode, Long quantity, Long stock) {

    }

    /**
     *  {inheritDoc}
     */
    @Override
    public Product findProductByCategoryId(String name) {
        return null;
    }

    /**
     *  {inheritDoc}
     */
    @Override
    public Product findProductById(Long id) {
        return null;
    }

    /**
     *  {inheritDoc}
     */
    @Override
    public Product findProductByName(String name) {
        return null;
    }
}
