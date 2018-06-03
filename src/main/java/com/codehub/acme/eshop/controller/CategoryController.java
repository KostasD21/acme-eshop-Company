package com.codehub.acme.eshop.controller;

import com.codehub.acme.eshop.domain.Category;
import com.codehub.acme.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "categories")
public class CategoryController {

    /**
     * {@link CategoryService}
     */
    @Autowired
    private CategoryService categoryService;

    /**
     * This Controller returns a List of Categories from the DB
     * @return {@link Category}
     */
    @GetMapping
    public List<Category> categoryList() {
        return categoryService.getAllCategories();
    }

    /**
     * This controllers searches and returns a Category {@link Category} from the DB regarding a given Id
     * @return {@link Category}
     */
    @GetMapping( value ="{categoryId}")
    public Category getCategoryById(@PathVariable Long categoryId){
        return categoryService.getCategoryById(categoryId);
    }
    /**
     * This Controller adds/creates a new Category {@link Category} to the DB
     * @param category
     */
    @PostMapping
     public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
        }
    /**
     * This Controller searches and returns a Category{@link Category} from the DB regarding a given name
     * @param categoryName
     * return {@link Category}
      */
    @GetMapping(value ="/{categoryName}")
    public Category findByName(@PathVariable String categoryName){
        return categoryService.findByName(categoryName);
    }

    /**
     * This Controller removes a Category from the DB regarding a given name
     */
    @DeleteMapping(value = "/{categoryName}")
    public void deleteCategory(@PathVariable String categoryName){
        categoryService.removeCategory(categoryName);

        /**
         * This Controller removes a Category from the DB regarding a given Id
         */
    }
    @DeleteMapping(value ="/{categoryId}")
    public void deleteCategorybyId(@PathVariable Long categoryId){
        categoryService.removeCategorybyId(categoryId);
    }






}
