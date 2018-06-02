package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ProductStock;
import com.codehub.acme.eshop.repository.ProductItemRepository;
import com.codehub.acme.eshop.repository.ProductStockRepository;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import com.codehub.acme.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

/**
 * This Service contains all the implementations of methods regarding the {@link Product} functionality
 */

@Service
public class ProductServiceImpl implements ProductService  {

    /**
     * {@link ProductRepository}
     */
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductStockRepository productStockRepository;

    @Autowired
    private ProductItemRepository productItemRepository;

    String stock = "OUT_OF_STOCK";

    /**
     *  {inheritDoc}
     */
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     *  {inheritDoc}
     */
    @Override
    public void removeProduct(Long id) {
    productRepository.deleteById(id);
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

    /**
     *{inheritDoc}
     */
    @Override
    public List<Product> getAllProducts(Long categoryId) {
        List<Product> products = new ArrayList<>();
        productRepository.findByCategoryId(categoryId)
                .forEach(products::add);
        return products;


    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> findAllProducts() {
        long stock = 0;
        List<ProductStock> productStockList = productStockRepository.findByStockEquals(stock);
        List<Product> productOutOfStock = new ArrayList<>();

        for(int i=0; i <productStockList.size(); i++){
            productOutOfStock.add(productRepository.getProductById(productStockList.get(i).getId()));
        }

        return productOutOfStock;
    }


}