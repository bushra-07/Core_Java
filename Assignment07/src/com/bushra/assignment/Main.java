package com.bushra.assignment;

public class Main {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Fruit apple = new Fruit("Apple", 1.99);
        Fruit banana = new Fruit("Banana");

        // Displaying fruit information
        System.out.println("Apple details:");
        apple.display();

        System.out.println("Banana details:");
        banana.display();
    }
}
