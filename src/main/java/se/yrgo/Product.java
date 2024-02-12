package se.yrgo;

public class Product {
    private int productId;
    private String name;
    private double unitPrice;
    private int quantity;

    public Product(int productId, String name, double unitPrice, int quantity) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
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

    public double calculatePricePerProduct() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f SEK, quantity: %d%n",
                              productId, name, unitPrice, quantity);
    }
}
