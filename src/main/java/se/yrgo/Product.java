package se.yrgo;

/**
 * Represents the product. Each product has an ID, name, price and quantity.
 */

public class Product {
    private int productId;
    private String name;
    private double unitPrice;
    private int quantity;

    /**
     * Constructs the product object with a given ID number, name and price. Sets the quantity to 0.
     * @param productId must be a 4 digit number
     * @param name can't be null
     * @param unitPrice must be 0 or bigger
     */
    public Product(int productId, String name, double unitPrice) {
        if (productId < 1000 || productId > 9999) {
            throw new IllegalArgumentException("Product ID must be a 4 digit number");
        }
        else {
            this.productId = productId;
        }
        if (name.equals(null)) {
            throw new NullPointerException("Name can't be null");
        }
        this.name = name;
        if (unitPrice < 0) {
            throw new IllegalArgumentException("Price can't be negative");
        }
        else {
            this.unitPrice = unitPrice;
        }
        this.quantity = 0;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity variable
     * @param quantity must be positive
     */
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can't be less than 0");
        }
        this.quantity = quantity;
    }

    /**
     * Method to calculate the total price per product
     * @return
     */
    public double calculatePricePerProduct() {
        return unitPrice * quantity;
    }

}
