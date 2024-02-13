package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    public void testValidCustomerCreation() {
        Customer customer = new Customer("123456789012", "John Doe", "john@example.com");
        assertNotNull(customer);
    }

    @Test
    public void testInvalidCustomerID() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Customer("12345678901", "John Doe", "john@example.com");
        });
    }

    @Test
    public void testValidName() {
        Customer customer = new Customer("123456789012", "John Doe", "john@example.com");
        assertNotNull(customer);
        assertEquals("John Doe", customer.getFullName());
    }
    @Test
    public void testInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Customer("123456789012", "John", "john@example.com");
        });
    }

    @Test
    public void testValidEmail() {
        Customer customer = new Customer("123456789012", "John Doe", "john@example.com");
        assertNotNull(customer);
        assertEquals("john@example.com", customer.getEmail());
    }
    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Customer("123456789012", "John Doe", "john.example.com");
        });
    }

    @Test
    public void testChangeEmail() {
        Customer customer = new Customer("123456789012", "John Doe", "john@example.com");
        customer.changeEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", customer.getEmail());
    }

    @Test
    public void testPlaceOrder() {
        Customer customer = new Customer("123456789012", "John Doe", "john@example.com");
        ShoppingCart cart = new ShoppingCart();
        customer.placeOrder(cart);

        assertTrue(customer.getOrderHistory().contains(cart));
    }
}
