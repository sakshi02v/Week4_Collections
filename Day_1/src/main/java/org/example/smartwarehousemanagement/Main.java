package org.example.smartwarehousemanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Storage<WarehouseItem> warehouse = new Storage<>();

        warehouse.addItem(new Electronics("Laptop", "Dell"));
        warehouse.addItem(new Groceries("Apple", "2025-12-31"));
        warehouse.addItem(new Furniture("Chair", "Wood"));

        System.out.println("Displaying all items:");
        warehouse.displayAllItems();

        List<WarehouseItem> items = new ArrayList<>();
        items.add(new Electronics("TV", "Sony"));
        items.add(new Groceries("Milk", "2025-03-15"));
        items.add(new Furniture("Table", "Metal"));

        System.out.println("Displaying items from a list:");
        warehouse.displayItems(items);
    }
}
