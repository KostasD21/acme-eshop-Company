package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ProductStock;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.enumerator.Availability;
import com.codehub.acme.eshop.repository.ProductItemRepository;
import com.codehub.acme.eshop.repository.ProductStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.codehub.acme.eshop.repository.ProductRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.EntityNotFoundException;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     *  {@inheritDoc}
     */
    @Override
    public void removeProduct(Long id) {
        productRepository.deleteById(id);
    }

    /**
     *  {@inheritDoc}
     */
    @Override
    public Product findProductById(Long id) {
        return productRepository.findById(id).get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product findProductByTitle(String title) {
        return productRepository.findByTitle(StringUtils.replace(title,"'", ""));
    }

    /**
     * {@inheritDoc}
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
    public List<ProductItem> addProductItems(List<Product> products, ShoppingBasket shoppingBasket) {
        List<ProductItem> productItems = new ArrayList<>();
        for (Product product : products) {
            try {
                productItems.add(productItemRepository.save(new ProductItem(1, product.getPrice(), shoppingBasket, null, product)));
            } catch (EntityNotFoundException e) {
                throw new RuntimeException("The product or shopping basket is invalid");
            }
        }
        return productItems;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeProductItem(Long productItemId) {
        try {
            productItemRepository.deleteById(productItemId);
        } catch (EmptyResultDataAccessException e) {
            throw new RuntimeException("The product item Id "+productItemId+" does not exist!");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductItem updateProductItem(ProductItem productsItem) {
        return productItemRepository.save(productsItem);
    }

    /**
     * {@inheritDoc}
     */
    public void setProductAvailability(ProductStock productStock) {
        if (productStock.getStock() >= 10) {
            productStock.setAvailability(Availability.IN_STOCK);
        } else if (productStock.getStock() >= 1) {
            productStock.setAvailability(Availability.LIMITED);
        } else {
            productStock.setAvailability(Availability.OUT_OF_STOCK);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductItem getProductItem(Long productItemId) {
        return productItemRepository.findById(productItemId).get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
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