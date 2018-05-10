package domain;

import java.util.Date;
//MANY TO ONE RELATIONSHIP WITH USER DOMAIN //

// ONE TO MANY RELATIONSHIP WITH PRODUCT_ORDER //

//ONE TO ONE RELATIONSHIP WITH SHOPPING _BASKET //

// ONE TO ONE RELATIONSHIP WITH BILLING_DETAILS DOMAIN //
public class Order {
    // UNIQUE ID OF ORDER FOR THE DATABASE//
    private Long id;

    private Date orderDate;
    private Long basketId;
    private Long billingDetails;

}
