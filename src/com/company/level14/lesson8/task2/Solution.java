package com.company.level14.lesson8.task2;

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    private static Wine getBubblyWine() {
        return new BubblyWine();
    }

    private static Wine getWine() {
        return new Wine();
    }

    private static Drink getDeliciousDrink() {
        return new Wine();
    }



}
