package org.example.shoppingcart;

public class Main{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 1200.0);
        cart.addProduct("Mouse", 25.0);
        cart.addProduct("Keyboard", 75.0);
        cart.addProduct("Monitor", 300.0);

        cart.addItemToCart("Laptop", 1);
        cart.addItemToCart("Mouse", 2);
        cart.addItemToCart("Keyboard", 1);
        cart.addItemToCart("Monitor", 1);
        cart.addItemToCart("Mouse", 1); // Add another mouse

        cart.displayCart();
        cart.displayCartSortedByPrice();

        cart.removeItemFromCart("Mouse");
        cart.displayCart();
        cart.displayCartSortedByPrice();


    }
}

