package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.exception.NotFoundException;
import com.codehub.acme.eshop.exception.ProductOutOfStockException;
import com.codehub.acme.eshop.exception.ShoppingBasketException;
import com.codehub.acme.eshop.repository.ProductItemRepository;
import com.codehub.acme.eshop.repository.ShoppingBasketRepository;
import com.codehub.acme.eshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This service contains the implementation of methods regarding the {@link ShoppingBasket} functionality
 */
@Service
public class ShoppingBasketServiceImpl implements ShoppingBasketService {

    /**
     * {@link ShoppingBasketRepository}
     */
    @Autowired
    private ShoppingBasketRepository shoppingBasketRepository;

    @Autowired
    private UserRepository userRepository;
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
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket findById(Long shoppingBasketId) {
        return shoppingBasketRepository.findById(shoppingBasketId).get();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket findByUserId(Long userId) {
        return shoppingBasketRepository.findByUserId(userId);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket addProducts(List<Product> products) {
        ShoppingBasket shoppingBasket = findByUserId(3L);
        List<ProductItem> productItems = new ArrayList<>();
        if (shoppingBasket == null) {
            shoppingBasket = shoppingBasketRepository.save(new ShoppingBasket(null, calculateTotalAmount(productItems),userRepository.findById(3L).get()));
        } else {
            shoppingBasket = shoppingBasketRepository.save(shoppingBasket);
        }
        productItems = productService.addProductItems(products, shoppingBasket);
        shoppingBasket.setProductItems(productItems);
        shoppingBasket.setTotalAmount(calculateTotalAmount(productItems));
        shoppingBasket = shoppingBasketRepository.save(shoppingBasket);
        return shoppingBasket;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket removeProductItem(Long shoppingBasketId, Long productItemId) {
        productService.removeProductItem(productItemId);
        ShoppingBasket shoppingBasket = findById(shoppingBasketId);
        return updateShoppingBasket(shoppingBasket, shoppingBasket.getProductItems());
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingBasket updateShoppingBasket(ShoppingBasket shoppingBasket, List<ProductItem> productItems) {
        List<ProductItem> productItemList = new ArrayList<>();
        for(ProductItem productItem : productItems) {
            Integer quantity = productItem.getQuantity();
            productItem = checkIfProductItemExist(productItem);
            BigDecimal amount = productItem.getAmount().multiply(new BigDecimal(quantity));
            productItem.setQuantity(quantity);
            productItem.setAmount(amount);
            checkIfProductItemBelongToShoppingBasket(shoppingBasket, productItem);
            checkProductStock(productItem);
            productItemList.add(productService.updateProductItem(productItem));
        }
        shoppingBasket.setProductItems(productItemList);
        shoppingBasket.setTotalAmount(calculateTotalAmount(productItemList));
        shoppingBasketRepository.save(shoppingBasket);
        return findById(shoppingBasket.getId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean exists(Long shoppingBasketId) {
        return shoppingBasketRepository.existsById(shoppingBasketId);
    }

    /**
     * This method validates if the product item exists
     *
     * @param productItem the {@link ProductItem}
     */
    private ProductItem checkIfProductItemExist(ProductItem productItem) {
        Optional<ProductItem> productItemTemp;
        productItemTemp = productItemRepository.findById(productItem.getId());
        if (productItemTemp.isPresent()) {
            return productItemTemp.get();
        } else {
            throw new NotFoundException("The product item with Id "+ productItem.getId() +" not found");
        }
    }

    /**
     * This method checks if the {@link ProductItem} belongs to the {@link ShoppingBasket}
     *
     * @param shoppingBasket {@link ShoppingBasket}
     * @param productItem the {@link ProductItem}
     */
    private void checkIfProductItemBelongToShoppingBasket(ShoppingBasket shoppingBasket, ProductItem productItem) {
        if (!shoppingBasket.getProductItems().contains(productItem)){
            throw new ShoppingBasketException("The product item with Id " + productItem.getId() + " does not belong to the shopping basket with Id " + shoppingBasket.getId());
        }
    }

    /**
     * This method checks if the {@link ProductItem} is in stock
     *
     * @param productItem the {@link ProductItem}
     */
    private void checkProductStock(ProductItem productItem) {
        if (productItem.getProduct().getProductStock().getStock() < productItem.getQuantity()) {
            throw new ProductOutOfStockException("The product with Id "+ productItem.getProduct().getId() +" is out of stock");
        }
    }

    /**
     * This method calculates the total amount of the shopping basket
     *
     * @param productItems the included product items
     * @return the total amount of the shopping basket
     */
    private BigDecimal calculateTotalAmount(List<ProductItem> productItems){
        BigDecimal totalAmount = new BigDecimal(0);
        for (ProductItem productItem : productItems){
            totalAmount = totalAmount.add(productItem.getAmount());
        }
        return totalAmount;
    }
}