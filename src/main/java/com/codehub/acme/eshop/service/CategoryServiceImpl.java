package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    public CategoryServiceImpl() {
    }

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private Category category;



    @Override
    public Category addCategory() {
        return null;
    }

    @Override
    public Category removeCategory() {
        return null;
    }

    @Override
    public List<Product> showCategories() {
        return category.getProducts();



    }

    @Override
    public List<Product> productsPerGivenCategory(String categoryName) {
        //prepei edw na pairnw to onoma tis kathgorias kai apo afto thn lista ths kathgorias poy anoikoyn se aythn! //
        return category.getProducts();
    }
}
