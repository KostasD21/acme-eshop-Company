package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.ShoppingBasket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * This interface contains signatures of methods for accessing the database regarding the {@link ShoppingBasket}
 */
@Repository
public interface ShoppingBasketRepository extends CrudRepository<ShoppingBasket, Long> {
    /**
     * Search {@link ShoppingBasket} by ID
     *
     * @param id of the {@link ShoppingBasket} to be searched
     * @return {@link ShoppingBasket}
     */
    Optional<ShoppingBasket> findById(Long id);
    /**
     * Search {@link ShoppingBasket} by user ID
     *
     * @param userId the user ID
     * @return {@link ShoppingBasket}
     */
    Optional<ShoppingBasket> findByUserId(Long userId);
    /**
     * Saves the {@link ShoppingBasket}
     *
     * @param shoppingBasket {@link ShoppingBasket}
     * @return the stored {@link ShoppingBasket}
     */
    ShoppingBasket save(ShoppingBasket shoppingBasket);
    /**
     * Updates the {@link ShoppingBasket}
     *
     * @param shoppingBasket {@link ShoppingBasket}
     * @return the updated {@link ShoppingBasket}
     */
    ShoppingBasket update(ShoppingBasket shoppingBasket);
}
