package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> basket;

    public ShoppingCart() {
        this.basket = new ArrayList<>();
    }

    public void addProduct(Product item){
        basket.add(item);
    }

    public void removeProduct(Product item){
     basket.remove(item);
    }

    public double totalCost(){
        double totalCost = 0;
        for (Product product : basket) {
            totalCost += product.calculatePricePerProduct();
        }
        return totalCost;
    }

    public void showBasket(){
        System.out.printf("Your order: %s", basket);
    }

}


