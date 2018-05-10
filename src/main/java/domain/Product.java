package domain;

// ONE TO MANY RELATIONSHIP ME TO CATEGORY DOMAIN //
//MANY TO ONE RELATIONSHIP ME TON SHOPPING_BASKET DOMAIN//
//MANY TO ONE RELATIONSHIP ME TO ORDER DOMAIN //


public class Product {
    // UNIQUE ID TOU DOMAIN GIA THN DATABASE //
    private Long Id;

    private String title;
    private String shortDescription;
    private String longDescription;
    private String productCode;

    // OPTIONAL PREPEI NA SYZHTHSOUME PWS THA TO XRHSIMOPOIHSOYME //
    private String availability;
    private Category category;

    private Double price;

}
