package com.company.LevelTen.lesson4;

public class task2 {
    /*Расставьте правильно операторы приведения типа, чтобы получился ответ: d = 3.765
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;*/
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float)a / b;
        double d = a * 1e-3 + c;
        System.out.println(a+" "+b+" "+c);
        System.out.println(d);
    }
}
