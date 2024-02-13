package se.yrgo;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("200305043426", "John Doe", "Johndoe@mail.com");
        Product pepsiMax33 = new Product(1201, "Pepsi Max 33", 25.00);
        Product cheeseBurger = new Product(1303, "Cheeseburger", 48.00);
        Product mediumFries = new Product(1402, "Medium fries", 20.00);
        Product extraCheese = new Product(1501, "Extra cheese", 10.00);

        ShoppingCart basket1 = new ShoppingCart();

        basket1.addProduct(mediumFries);
        basket1.addProduct(pepsiMax33);
        basket1.addProduct(cheeseBurger);
        basket1.addProduct(extraCheese);
        basket1.addProduct(extraCheese);

        basket1.showBasket();

        System.out.println();

        basket1.removeProduct(extraCheese);

        basket1.showBasket();


        customer.placeOrder(basket1);
        System.out.println(" ");
        customer.viewOrderHistory();
    }
}