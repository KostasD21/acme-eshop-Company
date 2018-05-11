package domain;
//MANY TO ONE RELATIONSHIP WITH PRODUCTS //
public class Category {
    // UNIQUE ID TOU DOMAIN GIA THN DATABASE //
    private Long Id;
    private String categoryName;
    private Product product;

    public Category(){}

    public Category(String categoryName, Product product) {
        this.categoryName = categoryName;
        this.product = product;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
