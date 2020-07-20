package com.company.level14.lesson8.bonusTask3;

public class Solution {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstanse();
        Singleton singleton1 = Singleton.getInstanse();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
