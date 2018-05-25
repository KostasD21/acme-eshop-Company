package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.ProductStock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface contains the signatures for the CRUD functionality regarding {@link ProductStock}
 */
@Repository
public interface ProductStockRepository extends CrudRepository<ProductStock, Long> {

    /**
     * This method deletes by product stock id
     *
     * @param id the product stock id
     */
    void deleteById(Long id);

    /**
     * this method saves/updates a {@link ProductStock}
     *
     * @param productStock the product stock
     * @return {@link ProductStock}
     */
    ProductStock save(ProductStock productStock);
}
