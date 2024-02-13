package se.yrgo;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Product class
 */
public class ProductTest {

    /**
     * Test for constructor with invalid ID
     */
    @Test
    public void testInvalidProductId() {
        assertThrows(IllegalArgumentException.class, () -> new Product(111, "McFlurry vanilla", 15.00));
    }

    /**
     * Test for constructor with invalid name
     */
    @Test
    public void testInvalidName() {
        assertThrows(NullPointerException.class, () -> new Product(1101, null, -15.00));
    }

    /**
     * Test for constructor with invalid price
     */
    @Test
    public void testInvalidPrice() {
        assertThrows(IllegalArgumentException.class, () -> new Product(1101, "McFlurry vanilla", -15.00));
    }

    /**
     * Test for calculatePricePerProduct() method 
     */
    @Test
    public void testCalculatePricePerProduct() {
        Product product = new Product(1101, "McFlurry vanilla", 15.00);
        product.setQuantity(2);
        assertEquals(30.00, product.calculatePricePerProduct());
    }
}
