package com.codehub.acme.eshop.transformation;

import com.codehub.acme.eshop.domain.Purchase;
import com.codehub.acme.eshop.domain.UserOrder;
import com.codehub.acme.eshop.enumerator.Provider;
import com.codehub.acme.eshop.enumerator.PurchaseStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseDto {

    private Long id;
    /**
     * the purchase date
     */
    private Date purchaseDate;
    /**
     * the {@link UserOrder}
     */
    @JsonIgnore
    private UserOrder order;
    /**
     * Reference id regarding the unique ID that we receive from the provider
     */
    private String referenceId;
    /**
     * The type of provider
     * {@link Provider}
     */
    private Provider provider;
    /**
     * Total amount of the purchase
     */
    private BigDecimal amount;
    /**
     * The status of the purchase
     * {@link PurchaseStatus}
     */
    private PurchaseStatus purchaseStatus;

    public PurchaseDto(Purchase purchase) {
        this.id = purchase.getId();
        this.purchaseDate = purchase.getPurchaseDate();
        this.referenceId = purchase.getReferenceId();
        this.provider = purchase.getProvider();
        this.amount = purchase.getAmount();
        this.purchaseStatus = purchase.getPurchaseStatus();
    }

    /**
     * this method gets the id
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * this method sets the id
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * this method gets the purchaseDate
     *
     * @return the purchaseDate
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * this method sets the purchaseDate
     *
     * @param purchaseDate the purchaseDate
     */
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * this method gets the order
     *
     * @return the order
     */
    public UserOrder getOrder() {
        return order;
    }

    /**
     * this method sets the order
     *
     * @param order the order
     */
    public void setOrder(UserOrder order) {
        this.order = order;
    }

    /**
     * this method gets the referenceId
     *
     * @return the referenceId
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * this method sets the referenceId
     *
     * @param referenceId the referenceId
     */
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * this method gets the provider
     *
     * @return the provider
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * this method sets the provider
     *
     * @param provider the provider
     */
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    /**
     * this method gets the amount
     *
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * this method sets the amount
     *
     * @param amount the amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * this method gets the purchaseStatus
     *
     * @return the purchaseStatus
     */
    public PurchaseStatus getPurchaseStatus() {
        return purchaseStatus;
    }

    /**
     * this method sets the purchaseStatus
     *
     * @param purchaseStatus the purchaseStatus
     */
    public void setPurchaseStatus(PurchaseStatus purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }
}
