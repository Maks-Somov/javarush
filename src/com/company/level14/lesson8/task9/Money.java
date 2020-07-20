package com.company.level14.lesson8.task9;

public abstract class Money {

    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public abstract String getCurrencyName();
}
