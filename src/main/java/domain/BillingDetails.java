package domain;

public class BillingDetails {

    // UNIQUE ID TOU DOMAIN GIA THN DATABASE //
    private Long Id;
    private String adress;
    private String postCode;
    //TA PARAKATW ATTRIBUTES EINAI ENUM //
    private String shippingMethods;
    private String receiptMethods;
    private String paymentMethods;

    public BillingDetails(){}

    public BillingDetails(Long id, String adress, String postCode,
                          String shippingMethods, String receiptMethods, String paymentMethods) {
        Id = id;
        this.adress = adress;
        this.postCode = postCode;
        this.shippingMethods = shippingMethods;
        this.receiptMethods = receiptMethods;
        this.paymentMethods = paymentMethods;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getShippingMethods() {
        return shippingMethods;
    }

    public void setShippingMethods(String shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    public String getReceiptMethods() {
        return receiptMethods;
    }

    public void setReceiptMethods(String receiptMethods) {
        this.receiptMethods = receiptMethods;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
