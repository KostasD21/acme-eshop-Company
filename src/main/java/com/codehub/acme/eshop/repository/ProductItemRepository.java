package com.codehub.acme.eshop.repository;


import com.codehub.acme.eshop.domain.ProductItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface contains the signatures for the CRUD functionality regarding {@link ProductItem}
 */
@Repository
public interface ProductItemRepository extends CrudRepository<ProductItem, Long> {

    /**
     * This method deletes by product item id
     *
     * @param id the product item id
     */
    void deleteById(Long id);

    /**
     * this method saves/updates a {@link ProductItem}
     *
     * @param productItem the product item
     * @return {@link ProductItem}
     */
    ProductItem save(ProductItem productItem);


}
