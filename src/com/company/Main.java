package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {
        // write your code here
        System.out.println(min(5, 9));
        System.out.println(minFour(4, 7, 1, 9));
        System.out.println(addTenPersent(1000));
        System.out.println(multiply());
        table();




    }

    private static int min(int a, int b) {
        return (a > b) ? b : a;
    }

    private static int minFour(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int addTenPersent(int a) {
        return (a / 100) * 10 + a;
    }

    public static int multiply() {
        int k = 1;
        for (int i = 1; i <= 10; i++) {
            k *= i;
        }
        return k;
    }

    public static void table() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
    }
}
