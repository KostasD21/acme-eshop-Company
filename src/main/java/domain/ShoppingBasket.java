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

    public ShoppingBasket(){}

    public ShoppingBasket(Product productId, BigDecimal productPrice, int productQuantity, BigDecimal totalAmount, Long userId) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.totalAmount = totalAmount;
        this.userId = userId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
