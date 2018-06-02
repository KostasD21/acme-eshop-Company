package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ProductStock;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.exception.NotFoundException;
import com.codehub.acme.eshop.repository.ProductItemRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.codehub.acme.eshop.repository.ProductStockRepository;
import org.apache.tomcat.util.digester.ArrayStack;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import com.codehub.acme.eshop.repository.ProductRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
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
    private static final Logger logger = LogManager.getLogger(ProductServiceImpl.class);

    String stock = "OUT_OF_STOCK";

    /**
     *  {inheritDoc}
     */
    @Override
    public Product addProduct(Product product) {
        logger.debug("The method of adding a product is about to start");
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
        logger.debug("The method of finding all products by category is about to start");
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
        logger.debug("The method of adding a product item to a shopping basket is about to start");
        List<ProductItem> productItems = new ArrayList<>();
        for (Product product : products) {
            try {
                productItems.add(productItemRepository.save(new ProductItem(1, product.getPrice(), shoppingBasket, null, product)));
            } catch (EntityNotFoundException e) {
                logger.error("The product or shopping basket is invalid");
                throw new RuntimeException("The product or shopping basket is invalid");
            }/* catch (ConstraintViolationException e) {
                throw new RuntimeException("The shopping basket is invalid");
            }*/
        }
        return productItems;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void removeProductItem(Long productItemId) {
        logger.debug("The method of removing a product item from a shopping basket is about to start");
        try {
            productItemRepository.deleteById(productItemId);
        } catch (EmptyResultDataAccessException e) {
            logger.error("The product item Id"+productItemId+" not found!");
            throw new NotFoundException("The product item Id "+productItemId+" not found!");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<ProductItem> updateProductItems(List<ProductItem> productsItems) {
        return (Collection<ProductItem>) productItemRepository.saveAll(productsItems);
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