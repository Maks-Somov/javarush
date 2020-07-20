package com.company.level14.lesson2.task2;

public class Solution {
    public static void main(String[] args) {
        Cat o = new TomCat();

        boolean isCat = o instanceof Cat;
        boolean isMovable = o instanceof Movable;
        boolean isTom = o instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface Movable {
    }

    static class Cat implements Movable {
    }

    static class TomCat extends Cat {

    }
}
