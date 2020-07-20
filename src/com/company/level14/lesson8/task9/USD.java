package com.company.level14.lesson8.task9;

public class USD extends Money {

    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
