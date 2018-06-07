package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.BillingDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingDetailsRepository extends CrudRepository<BillingDetails, Long> {

}
