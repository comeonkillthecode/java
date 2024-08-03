package org.akash.java.library.management;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Integer> bookInventory;

    public Library() {
        this.bookInventory = new HashMap<>();
    }

    public void addBook(String bookName, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        bookInventory.put(bookName, bookInventory.getOrDefault(bookName, 0) + quantity);
    }

    public void checkoutBook(String bookName) {
        if (!bookInventory.containsKey(bookName)) {
            throw new IllegalArgumentException("Book with given name is not available.");
        }
        int currentQuantity = bookInventory.get(bookName);
        if (currentQuantity == 0) {
            throw new IllegalArgumentException("Book is out of stock.");
        }
        bookInventory.put(bookName, currentQuantity - 1);
    }

    public void returnBook(String bookName) {
        if (!bookInventory.containsKey(bookName)) {
            throw new IllegalArgumentException("Book with given name is not available.");
        }
        bookInventory.put(bookName, bookInventory.get(bookName) + 1);
    }

    public void showBooks() {
        System.out.println("Books and their quantities:");
        for (Map.Entry<String, Integer> entry : bookInventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void removeBook(String bookName) {
        if (!bookInventory.containsKey(bookName)) {
            throw new IllegalArgumentException("Book with given name is not available.");
        }
        bookInventory.remove(bookName);
    }

    public int getBookQuantity(String bookName) {
        return bookInventory.getOrDefault(bookName, 0);
    }
}
