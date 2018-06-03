package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.exception.NotFoundException;
import com.codehub.acme.eshop.repository.ProductItemRepository;
import com.codehub.acme.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

/**
 * This controller handles the requests for the {@link Product}
 */
@RestController
public class ProductController {

    /**
     * {@link ProductService}
     */
    @Autowired
    private ProductService productService;

    /**
     * {@link ProductItemRepository}
     */
    @Autowired
    private ProductItemRepository productItemRepository;

    @GetMapping(value ="/categories/{categoryId}/products")
    public List<Product> findProductsByCategoryId(@PathVariable Long categoryId){
        return productService.getAllProducts(categoryId);
    }

    @GetMapping(value = "/getProductItems")
    public List<ProductItem> getAll(){
         return (List<ProductItem>) productItemRepository.findAll();
    }
    @PostMapping(value ="products/new")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    /**
     * This method searches for a product
     *
     * @param text the client's free text
     * @return the {@link Product} that found
     */
    @GetMapping(value ="products")
    public Product searchProduct(@RequestParam String text){
        try {
            return productService.findProductByTitle(text);
        } catch (EntityNotFoundException e) {
            throw new NotFoundException("The product with title " + text + " not found");
        }
    }
}

