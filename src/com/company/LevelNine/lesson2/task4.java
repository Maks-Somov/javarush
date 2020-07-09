package com.company.LevelNine.lesson2;

public class task4 {
    /*Напиши код, чтобы получить стек-трейс длиной 10 вызовов.*/
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        method4();

    }

    private static void method4() {
        method5();
    }

    private static void method5() {
        method6();
    }

    private static void method6() {
        method7();
    }

    private static void method7() {
        method8();
    }

    private static void method8() {
        method9();
    }

    private static void method9() {
        method10();
    }

    private static void method10() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
    }
}
