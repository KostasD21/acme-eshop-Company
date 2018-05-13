package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.Product;

public class ProductServiceImpl implements ProductService  {


    @Override
    public void addProduct(String title, String shortDescription, String longDescription, String productCode, Long quantity, Long stock) {
        
    }

    @Override
    public void removeProduct(Long id) {

    }

    @Override
    public void updateProductDetails(String title, String shortDescription, String longDescription, String productCode, Long quantity, Long stock) {

    }

    @Override
    public Product findProductByCategoryId(String name) {
        return null;
    }

    @Override
    public Product findProductById(Long id) {
        return null;
    }

    @Override
    public Product findProductByName(String name) {
        return null;
    }
}
