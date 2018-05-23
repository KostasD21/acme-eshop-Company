package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service contains the implementation of methods regarding the {@link Category} functionality
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


    /**
     * {@inheritDoc}
     */
    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void removeCategory(String name) {
        categoryRepository.deleteByName(name);
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public void removeCategorybyId(Long id) {
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
    public List<Product> productsPerGivenCategory(String categoryName) {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.getCategoryById(id);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }




}
