package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> basket;

    public ShoppingCart() {
        this.basket = new ArrayList<>();
    }

    public void addProduct(Product item) {
        if (basket.contains(item)) {
            item.setQuantity(item.getQuantity() + 1);
        } else {
            basket.add(item);
            item.setQuantity(item.getQuantity() + 1);
        }
    }

    public void removeProduct(Product item) {
        if (item.getQuantity() > 1) {
            item.setQuantity(item.getQuantity() - 1);
        } else {
            item.setQuantity(item.getQuantity() - 1);
            basket.remove(item);
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product item : basket) {
            totalCost += item.calculatePricePerProduct();
        }
        if(totalCost < 0){
            throw new IllegalArgumentException("Can not return money here. Contact employee.");
        }
        return totalCost;
    }

    public void showBasket() {
        System.out.printf("Your order: %n");
        for (Product item : basket) {
            System.out.printf("%d, %s, %d, %.2f%n", item.getProductId(), item.getName(), item.getQuantity(),
                    item.calculatePricePerProduct());
        }
        System.out.printf("Total cost: %.2f%n", calculateTotalCost());
    }

    public List<Product> getBasket() {
        return basket;
    }

    

}
