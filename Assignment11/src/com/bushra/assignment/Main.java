package com.bushra.assignment;

public class Main {
    public static void main(String[] args) {
       
        Inventory<Product> productInventory = new Inventory<>();

        Product product1 = new Product("P100", "Mobile", 99.99);
        Product product2 = new Product("P200", "Laptop", 599.99);

        productInventory.addProduct(product1);
        productInventory.addProduct(product2);

        productInventory.displayInventory();

        productInventory.removeProduct(product1);

        productInventory.displayInventory();
    }
}