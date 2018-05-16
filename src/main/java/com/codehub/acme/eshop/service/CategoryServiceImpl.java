package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service contains the implementation of methods regarding the {@link Category} functionality
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    /**
     * {@inheritDoc}
     */
    @Override
    public Category addCategory(Long id, String name, String description) {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void removeCategory(String name) {}
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> getAllCategories() {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> productsPerGivenCategory(String categoryName) {
        //prepei edw na pairnw to onoma tis kathgorias kai apo afto thn lista ths kathgorias poy anoikoyn se aythn! //
        return category.getProducts();
    }
}
