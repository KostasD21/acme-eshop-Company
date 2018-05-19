package com.codehub.acme.eshop.domain;


import com.codehub.acme.eshop.enumerator.Provider;
import com.codehub.acme.eshop.enumerator.PurchaseStatus;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Purchase {

    /**
     * the purchase id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PURCHASE_ID", nullable = false)
    private Long id;

    /**
     * the purchase date
     */
    private Date purchaseDate;

    /**
     * the {@link Order}
     */
    @OneToOne(optional=false)
    @JoinColumn(name = "ORDER_DETAILS_ID")
    private Order orderDetails;

    /**
     * Reference id regarding the UID that we receive from the provider
     */
    private String referenceId;

    /**
     * {@link Provider}
     * The type of provider
     */
    private Provider provider;

    /**
     * Total amount of the purchase
     */
    private BigDecimal amount;

    /**
     * {@link PurchaseStatus}
     * The status of the purchase
     */
    private PurchaseStatus purchaseStatus;

    /**
     * No arguments Constructor of the class
     */
    public Purchase() {
    }

    /**
     * With arguments Constructor of the class
     */
    public Purchase(Date purchaseDate, Order orderDetails, String referenceId, Provider provider, BigDecimal amount, PurchaseStatus purchaseStatus) {
        this.purchaseDate = purchaseDate;
        this.orderDetails = orderDetails;
        this.referenceId = referenceId;
        this.provider = provider;
        this.amount = amount;
        this.purchaseStatus = purchaseStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Order getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Order orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PurchaseStatus getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(PurchaseStatus purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }
}
