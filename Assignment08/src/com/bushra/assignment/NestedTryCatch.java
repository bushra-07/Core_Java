package com.bushra.assignment;

public class NestedTryCatch {

    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3, 4};
            
            try {
                // Inner try block: accessing an invalid array index
                System.out.println("Accessing element at index 5: " + numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle ArrayIndexOutOfBoundsException inside the inner try block
                System.out.println("Caught ArrayIndexOutOfBoundsException in inner try block: " + e.getMessage());
            }
            
            // This will not execute due to the exception in the inner try block
            String str = null;
            System.out.println("Length of string: " + str.length());
            
        } catch (NullPointerException e) {
            // Handle NullPointerException from the outer try block
            System.out.println("Caught NullPointerException in outer try block: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException from the outer try block
            System.out.println("Caught ArrayIndexOutOfBoundsException in outer try block: " + e.getMessage());
        }
    }
}
