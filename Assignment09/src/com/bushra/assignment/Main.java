package com.bushra.assignment;

// Main class to demonstrate the use of custom exception, throw, and throws
public class Main {
    public static void main(String[] args) {
        Form form = new Form("Bushra Shaikh", "bushra@example.com", 21);
        FormValidator validator = new FormValidator();

        try {
            validator.validate(form);
            System.out.println("Form is valid.");
        } catch (InvalidFormException e) {
            System.err.println("Form validation failed: " + e.getMessage());
        }

        // Example with invalid data
        Form invalidForm = new Form("", "invalid-email", 17);
        try {
            validator.validate(invalidForm);
            System.out.println("Form is valid.");
        } catch (InvalidFormException e) {
            System.err.println("Form validation failed: " + e.getMessage());
        }
    }
}
