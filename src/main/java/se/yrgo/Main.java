package se.yrgo;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Product pepsiMax33 = new Product(1201, "Pepsi Max 33", 25.00, 1);
        Product cheeseBurger = new Product(1303, "Cheeseburger", 48.00, 1);
        Product mediumFies = new Product(1402, "Medium fries", 20.00, 1);
        Product extraCheese = new Product(1501, "Extra cheese", 5.00, 2);

        System.out.println(pepsiMax33);
        System.out.println(cheeseBurger);
        System.out.println(mediumFies);
        System.out.println(extraCheese);

        System.out.println();

        System.out.printf("Pris pepsi: %.2f%n", pepsiMax33.calculatePricePerProduct());
        System.out.printf("Pris cheeseburgare: %.2f%n", cheeseBurger.calculatePricePerProduct());
        System.out.printf("Pris fries: %.2f%n", mediumFies.calculatePricePerProduct());
        System.out.printf("Pris extra ost: %.2f%n", extraCheese.calculatePricePerProduct());
    }
}