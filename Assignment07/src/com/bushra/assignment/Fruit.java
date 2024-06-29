package com.bushra.assignment;

public class Fruit {
    private String name;
    private double price;

    // Constructor with both name and price parameters
    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Constructor with only name parameter (default price set to 0.0)
    public Fruit(String name) {
        this.name = name;
        this.price = 0.0; // Default price
    }

    // Method to display fruit information
    public void display() {
        System.out.println("Fruit: " + name + ", Price: $" + price);
    }
}
