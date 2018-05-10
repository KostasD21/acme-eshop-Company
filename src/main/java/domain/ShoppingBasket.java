package domain;

import java.math.BigDecimal;

// ONE TO ONE RELATIONSHIP WITH USER DOMAIN//
// ONE TO MANY RELATIONSHIP WITH PRODUCT DOMAIN//
// ONE TO ONE RELATIONSHIP WITH ORDER DOMAIN//

public class ShoppingBasket {
    // // UNIQUE ID OF SHOPPING_BASKET DOMAIN FOR THE DATABASE//
    private Long Id;

    private Product productId;
    private BigDecimal productPrice;
    private int productQuantity;
    private BigDecimal totalAmount;
    private Long userId;
}
