package com.codehub.acme.eshop.controller;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.exception.NotFoundException;
import com.codehub.acme.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class CategoryController {

    /**
     * The default URL for all the methods
     */
    private static final String DEFAULT_RESOURCE = "/categories";
    /**
     * {@link CategoryService}
     */
    @Autowired
    private CategoryService categoryService;

    /**
     * This Controller returns a List of Categories from the DB
     * @return {@link Category}
     */
    @GetMapping(DEFAULT_RESOURCE)
    public List<Category> categoryList() {
        return categoryService.getAllCategories();
    }

    /**
     * This controllers searches and returns a Category {@link Category} from the DB regarding a given Id
     * @return {@link Category}
     */
    @GetMapping( value = DEFAULT_RESOURCE + "/{categoryId}")
    public Category getCategoryById(@PathVariable Long categoryId){
        try {
            return categoryService.getCategoryById(categoryId);
        }catch (NoSuchElementException e){
            throw new NotFoundException("The category with the id: "+categoryId + " cannot be found");
        }
    }
    /**
     * This Controller adds/creates a new Category {@link Category} to the DB
     * @param category
     */
    @PostMapping(value = DEFAULT_RESOURCE)
     public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
        }
    /**
     * This Controller searches and returns a Category{@link Category} from the DB regarding a given name
     * @param categoryName
     * return {@link Category}
      */
    @GetMapping(value = DEFAULT_RESOURCE +"/categoryName/{categoryName}")
    public Category findByName(@PathVariable String categoryName){
        try {
            return categoryService.findByName(categoryName);
        }catch(NoSuchElementException e){
            throw new NotFoundException("The category with the name: "+categoryName+" cannot be found");
        }
    }

    /**
     * This Controller removes a Category from the DB regarding a given name
     */
    @DeleteMapping(value = DEFAULT_RESOURCE +"/{categoryName}")
    public void deleteCategory(@PathVariable String categoryName){
        categoryService.removeCategory(categoryName);

        /**
         * This Controller removes a Category from the DB regarding a given Id
         */
    }
    @DeleteMapping(value = DEFAULT_RESOURCE +"/{categoryId}")
    public void deleteCategorybyId(@PathVariable Long categoryId){
        categoryService.removeCategorybyId(categoryId);
    }






}
