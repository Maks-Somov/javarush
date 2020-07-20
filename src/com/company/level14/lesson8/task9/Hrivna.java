package com.company.level14.lesson8.task9;

public class Hrivna extends Money {

    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
