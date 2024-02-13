package se.yrgo;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer with a unique ID, full name, and email address.
 * Contains methods for placing orders and viewing their history.
 */
public class Customer {
    private String customerID;
    private String fullName;
    private String email;

    private List<ShoppingCart> orderHistory = new ArrayList<>();

    public List<ShoppingCart> getOrderHistory() {
        return orderHistory;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public void changeEmail(String newEmail) {
        email = newEmail;
    }

    private boolean isValidCustomerID(String customerID) {
        String customerIDRegex = "^[0-9]{12}$"; // Following the standard format of a Swedish personal number.
        return customerID.matches(customerIDRegex);
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"; // The string must consist of a local part, an @
                                                                 // symbol, and a domain part.
        return email.matches(emailRegex);
    }

    private boolean isValidName(String name) {
        String nameRegex = "^[A-Za-z]+ [A-Za-z]+$"; // The string must consist of at least a first and last name,
                                                    // separated by a space.
        return name.matches(nameRegex);
    }

    /**
     * Constructs a new Customer object with the specified customer ID, name, and
     * email address. Checks for validity of parameters.
     * 
     * @param customerID The unique ID of the customer, follows swedish personal
     *                   number format.
     * @param name       The full name of the customer.
     * @param email      The email address of the customer.
     */
    public Customer(String customerID, String name, String email) {
        if (!isValidEmail(email) || !isValidName(name) || !isValidCustomerID(customerID)) {
            throw new IllegalArgumentException(
                    "The provided credentials are not valid, customerID follows the standard Swedish personal number format and name must consist of both first and last name. Email follows the standard email format.");
        }

        this.customerID = customerID;
        this.fullName = name;
        this.email = email;
    }

    public void ViewOrderHistory() {
        System.out.println("Order history: ");
        int index = 1;
        for (ShoppingCart cart : orderHistory) {
            System.out.println(index + ". ");
            cart.showBasket();
            System.out.printf("\n");

            index++;
        }
    }

    public void PlaceOrder(ShoppingCart cart) {
        System.out.println("Order placed successfully!");
        cart.showBasket();
        orderHistory.add(cart);
    }
}
