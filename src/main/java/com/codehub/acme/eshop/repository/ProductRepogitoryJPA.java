package com.codehub.acme.eshop.repository;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepogitoryJPA implements ProductRepository {

    List<Products> getProduct();

}
