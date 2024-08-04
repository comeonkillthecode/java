package org.akash.java.product;

public class Product {
    private String name;
    private double price;
    private int quantity;

    Product(){

    }

    public Product(String name) {
        this.name = name;
    }

    public Product(double price) {
        this.price = price;
    }

    public Product(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Product(int quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
