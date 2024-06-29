package com.bushra.assigment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary for Bushra: ");
        double bushraSalary = scanner.nextDouble();
        TaxPayer bushra = new Bushra(bushraSalary);
        
        System.out.print("Enter your salary for Alice: ");
        double aliceSalary = scanner.nextDouble();
        TaxPayer alice = new Alice(aliceSalary);

        System.out.println("Tax calculation by Bushra:");
        bushra.displayTax();

        System.out.println("Tax calculation by Alice:");
        alice.displayTax();

        scanner.close();
    }
}
