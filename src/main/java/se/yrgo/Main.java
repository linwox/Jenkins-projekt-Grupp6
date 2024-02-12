package se.yrgo;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Product pepsiMax33 = new Product(1201, "Pepsi Max 33", 25.00, 1);
        Product cheeseBurger = new Product(1303, "Cheeseburger", 48.00, 1);
        Product mediumFries = new Product(1402, "Medium fries", 20.00, 1);
        Product extraCheese = new Product(1501, "Extra cheese", 5.00, 2);

        ShoppingCart basket1 = new ShoppingCart();

        basket1.addProduct(mediumFries);
        basket1.addProduct(pepsiMax33);
        basket1.addProduct(extraCheese);
        basket1.showBasket();
        
        System.out.println();
        basket1.removeProduct(extraCheese);
        basket1.showBasket();

        System.out.println();
        System.out.printf("Pris pepsi: %.2f%n", pepsiMax33.calculatePricePerProduct());
        System.out.printf("Pris cheeseburgare: %.2f%n", cheeseBurger.calculatePricePerProduct());
        System.out.printf("Pris fries: %.2f%n", mediumFries.calculatePricePerProduct());
        System.out.printf("Pris extra ost: %.2f%n", extraCheese.calculatePricePerProduct());
    }
}