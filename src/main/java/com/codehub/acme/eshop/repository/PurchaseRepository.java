package com.codehub.acme.eshop.repository;
import com.codehub.acme.eshop.domain.Order;
import com.codehub.acme.eshop.domain.Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

    /**
     * Searches for a {@link Purchase}
     * @param id of the Purchase to be searched
     * @return a list of {@link Purchase}
     */
    List<Purchase> findById(Long id);

    /**
     * Searches by Order id
     * @param id of the {@link Order}
     * @return {@link Purchase}
     */
    List<Purchase> findByOrderDetailsId(Long id);

    /**
     * Deletes a {@link Purchase}
     * @param id of the purchase
     */
    void deleteById(Long id);

    /**
     * Updates a {@link Purchase}
     * @param id of the purchase
     */
    void updateById(Long id);

    /**
     * Saves a {@link Purchase}
     * @param id of the purchase
     */
    void saveById(Long id);

}
