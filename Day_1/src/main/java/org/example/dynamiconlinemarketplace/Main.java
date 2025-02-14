package org.example.dynamiconlinemarketplace;

public class Main {
    public static void main(String[] args) {
        BookCategory fiction = new BookCategory("Fiction");
        ClothingCategory mensWear = new ClothingCategory("Men's Wear");
        GadgetCategory electronics = new GadgetCategory("Electronics");

        Product<BookCategory> book = new Product<>("The Great Gatsby", 500, fiction);
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", 1000, mensWear);
        Product<GadgetCategory> smartphone = new Product<>("Smartphone", 20000, electronics);

        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(smartphone);

        DiscountManager.applyDiscount(book, 10);
        DiscountManager.applyDiscount(shirt, 15);
        DiscountManager.applyDiscount(smartphone, 20);

        System.out.println("\nAfter Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(smartphone);
    }
}

