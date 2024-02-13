package se.yrgo;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testCalculatePricePerProduct() {
        Product product = new Product(1101, "McFlurry vanilla", 15.00);
        product.setQuantity(2);
        assertEquals(30.00, product.calculatePricePerProduct());
    }
}
