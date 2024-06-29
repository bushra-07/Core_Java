package com.bushra.assigment;

public class Bushra extends TaxPayer {

    public Bushra(double salary) {
        super(salary);
    }

    public double calculateTax() {
        return salary * 0.15;
    }
}
