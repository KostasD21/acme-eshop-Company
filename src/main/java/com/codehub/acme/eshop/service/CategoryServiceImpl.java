package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.repository.CategoryRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This service contains the implementation of methods regarding the {@link Category} functionality
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    private static final Logger logger = LogManager.getLogger(CategoryServiceImpl.class);
    /**
     * {@link CategoryRepository}
     */
    @Autowired
    private CategoryRepository categoryRepository;


    /**
     * {@inheritDoc}
     */
    @Override
    public void addCategory(Category category) {
        logger.debug("The method of adding a new category is about to start");
        categoryRepository.save(category);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void removeCategory(String name) {
        logger.debug("The method of removing a category by category name is about to start");
        categoryRepository.deleteByName(name);
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public void removeCategorybyId(Long id) {
        logger.debug("The method of removing a category by category id is about to start");
        categoryRepository.deleteById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category getCategoryById(Long id) {
        logger.debug("The method of finding a category by category id is about to start");
        return categoryRepository.getCategoryById(id).get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category findByName(String name) {
        logger.debug("The method of finding a category by category name is about to start");
        return categoryRepository.findByName(name).get();
    }




}
