package com.company.level13.lesson2.task3;

public class Solution {
    public static class Beer implements Drink{

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }

    public static class Cola implements Drink{

        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }

    public interface Drink {
        boolean isAlcoholic();
    }
}
