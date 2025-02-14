package org.example.shoppingcart;

import java.util.*;

public class ShoppingCart {

    private HashMap<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Integer> cartItems = new LinkedHashMap<>();
    private TreeMap<Double, List<String>> sortedCartItems = new TreeMap<>();

    public void addProduct(String productName, double price) {
        productPrices.put(productName, price);
    }

    public void addItemToCart(String productName, int quantity) {
        if (!productPrices.containsKey(productName)) {
            System.out.println("Product not found: " + productName);
            return;
        }

        cartItems.put(productName, cartItems.getOrDefault(productName, 0) + quantity);
        updateSortedCartItems(productName);
    }

    public void removeItemFromCart(String productName) {
        if (!cartItems.containsKey(productName)) {
            System.out.println("Item not in cart: " + productName);
            return;
        }

        cartItems.remove(productName);
        removeSortedCartItem(productName);
    }

    private void updateSortedCartItems(String productName) {
        double price = productPrices.get(productName);
        if (!sortedCartItems.containsKey(price)) {
            sortedCartItems.put(price, new ArrayList<>());
        }
        sortedCartItems.get(price).add(productName);
    }

    private void removeSortedCartItem(String productName) {
        double price = productPrices.get(productName);
        if (sortedCartItems.containsKey(price)) {
            List<String> products = sortedCartItems.get(price);
            products.remove(productName);
            if (products.isEmpty()) {
                sortedCartItems.remove(price);
            }
        }
    }


    public void displayCart() {
        System.out.println("Shopping Cart (LinkedHashMap - Insertion Order):");
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void displayCartSortedByPrice() {
        System.out.println("\nShopping Cart (TreeMap - Sorted by Price):");
        for (Map.Entry<Double, List<String>> entry : sortedCartItems.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " (Price: " + entry.getKey() + ")");
            }
        }
    }
}
