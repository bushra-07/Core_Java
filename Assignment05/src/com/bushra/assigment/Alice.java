package com.bushra.assigment;


public class Alice extends TaxPayer {

    public Alice(double salary) {
        super(salary);
    }

    public double calculateTax() {
        if (salary <= 50000) {
            return salary * 0.10;
        } else {
            return salary * 0.20;
        }
    }
}
