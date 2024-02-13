package se.yrgo;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    ShoppingCart testShoppingCart = new ShoppingCart();
    Product testProduct = new Product(1001, "Ketchup", 5.00);

    @Test
    public void testAddProductCartEmpty() {
        ShoppingCart testShoppingCart = new ShoppingCart();
        Product testProduct = new Product(1001, "Ketchup", 5.00);
        testShoppingCart.addProduct(testProduct);
        assertEquals(1, testShoppingCart.getBasket().size());
        assertEquals(1, testProduct.getQuantity());
    }

    @Test
    public void testAddProductItemExists() {
        ShoppingCart testShoppingCart = new ShoppingCart();
        Product testProduct = new Product(1001, "Ketchup", 5.00);
        testShoppingCart.addProduct(testProduct);
        testShoppingCart.addProduct(testProduct);
        assertEquals(1, testShoppingCart.getBasket().size());
        assertEquals(2, testProduct.getQuantity());
    }

    @Test
    public void testRemoveProductMultipleItem() {
        ShoppingCart testShoppingCart = new ShoppingCart();
        Product testProduct = new Product(1001, "Ketchup", 5.00);
        testShoppingCart.addProduct(testProduct);
        testShoppingCart.addProduct(testProduct);
        testShoppingCart.removeProduct(testProduct);
        assertEquals(1, testShoppingCart.getBasket().size());
        assertEquals(1, testProduct.getQuantity());
    }

    @Test
    public void testRemoveProductOneItem() {
        ShoppingCart testShoppingCart = new ShoppingCart();
        Product testProduct = new Product(1001, "Ketchup", 5.00);
        testShoppingCart.addProduct(testProduct);
        testShoppingCart.removeProduct(testProduct);
        assertEquals(0, testShoppingCart.getBasket().size());
        assertEquals(0, testProduct.getQuantity());
    }

}
