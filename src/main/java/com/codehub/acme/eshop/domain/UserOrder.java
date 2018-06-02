package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This domain class represents a order
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name ="USER_ORDER")
@Entity
public class UserOrder implements Serializable {
    /**
     * the order id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private Long id;
    /**
     * the order date
     */
    @Column(name = "ORDER_DATE", nullable = false)
    private Date orderDate;
    /**
     * the {@link BillingDetails}
     */
    @OneToOne
    @JoinColumn(name = "BILLING_DETAILS_ID")
    private BillingDetails billingDetails;
    /**
     * the order status {@link OrderStatus}
     */
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    /**
     * the {@link List} of {@link ProductItem}
     */
    @OneToMany(mappedBy = "order")
    private List<ProductItem> productItems= new ArrayList<>();
    /**
     * the {@link User} of the order
     */
    @OneToOne
    private User user;
}