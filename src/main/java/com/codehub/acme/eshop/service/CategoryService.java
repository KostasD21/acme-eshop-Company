package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;

import java.util.List;

public interface CategoryService {
    public Category addCategory();
    public Category removeCategory();
    public List<Product> showCategories();
    public List<Product> productsPerGivenCategory(String categoryName);
}
