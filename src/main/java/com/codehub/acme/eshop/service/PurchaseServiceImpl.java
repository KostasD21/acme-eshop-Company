package com.codehub.acme.eshop.service;

import com.codehub.acme.eshop.domain.Product;
import com.codehub.acme.eshop.domain.ProductItem;
import com.codehub.acme.eshop.domain.Purchase;
import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.enumerator.OrderStatus;
import com.codehub.acme.eshop.enumerator.PurchaseStatus;
import com.codehub.acme.eshop.exception.NotFoundException;
import com.codehub.acme.eshop.repository.PurchaseRepository;
import com.codehub.acme.eshop.utils.GeneratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.NoSuchElementException;

/**
 * This service contains the implementation of methods regarding the {@link Purchase} functionality
 */
@Service
public class PurchaseServiceImpl implements PurchaseService {

    /**
     * {@link PurchaseRepository}
     */
    @Autowired
    private PurchaseRepository purchaseRepository;

    /**
     * {@link OrderService}
     */
    @Autowired
    private OrderService orderService;

    /**
     * {@link ProductService}
     */
    @Autowired
    private ProductService productService;

    /**
     * Search for Purchase by Id
     * @param Id Purchase Id
     * @return {@link Purchase}
     */
    @Override
    public Purchase findById(Long Id) {
        return null;
    }

    /**
     * Search by Order id
     * @param orderId Order Id
     * @return {@link Purchase}
     */
    @Override
    public Purchase findByOrderId(Long orderId) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Purchase completePurchase(Purchase purchase) {
        UserOrder userOrder;
        try {
            userOrder = orderService.findOrderById(purchase.getOrder().getId());
        } catch (NoSuchElementException e) {
            throw new NotFoundException("The order with Id "+ purchase.getOrder().getId() +" not found");

        }
        /*if (userOrder == null) {
            throw new NotFoundException("The order with Id "+ purchase.getOrder().getId() +" not found");
        }*/
        /* FIXME: Random Statuses for the purchase */
        purchase = purchaseRepository.save(new Purchase(new Date(), userOrder, GeneratorUtils.generateRandomHexToken(10), purchase.getProvider(), purchase.getAmount(), PurchaseStatus.ERROR));
        userOrder = setOrderStatusFromPurchaseStatus(purchase, userOrder);
        if (userOrder.getOrderStatus().equals(OrderStatus.ERROR)) {
            revertTheProductStock(userOrder);
        }
        orderService.saveOrder(userOrder);
        return purchase;
    }

    /**
     * Cancels a purchase
     * @param id the {@link Purchase} id
     */
    @Override
    public void cancelPurchase(Long id) {

    }

    private void revertTheProductStock(UserOrder userOrder) {
        for (ProductItem productItem : userOrder.getProductItems()) {
            productItem.getProduct().getProductStock().setStock(productItem.getQuantity() + productItem.getProduct().getProductStock().getStock());
            productService.save(productItem.getProduct());
        }
    }

    /**
     * This method sets the order status according to purchase
     *
     * @param purchase the purchase
     * @param userOrder the order
     * @return the updated {@link UserOrder}
     */
    private UserOrder setOrderStatusFromPurchaseStatus(Purchase purchase, UserOrder userOrder) {
        if (purchase.getPurchaseStatus().equals(PurchaseStatus.ACCEPTED)) {
            userOrder.setOrderStatus(OrderStatus.COMPLETED);
        } else if (purchase.getPurchaseStatus().equals(PurchaseStatus.ERROR)) {
            userOrder.setOrderStatus(OrderStatus.ERROR);
        } else if (purchase.getPurchaseStatus().equals(PurchaseStatus.CANCELED)) {
            userOrder.setOrderStatus(OrderStatus.CANCELED);
        }
        return userOrder;
    }
}
