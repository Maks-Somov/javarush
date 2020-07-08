package com.company.LevelEight.lesson12;

import java.util.Date;

public class task9 {
    /*1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
    если количество дней с начала года - нечетное число, иначе false
    2. String date передается в формате MAY 1 2013
    Не забудьте учесть первый день года.

    JANUARY 1 2000 = true
    JANUARY 2 2020 = false*/

    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date newDate = new Date(date);
        Date startYear = new Date(date);
        startYear.setDate(0);
        startYear.setMonth(0);
        long d = newDate.getTime() - startYear.getTime();
        long ms = 1000 * 60 * 60 * 24;
        int dayCount = (int) (d / ms);
        if (dayCount % 2 == 0)
            return false;
        else
            return true;
    }

}
