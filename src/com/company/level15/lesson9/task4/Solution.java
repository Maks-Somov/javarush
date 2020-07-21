package com.company.level15.lesson9.task4;

public class Solution {
    public static int A = 0;

    static {
        if (A == 0) throw new ExceptionInInitializerError();
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
