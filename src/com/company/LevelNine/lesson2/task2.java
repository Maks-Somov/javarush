package com.company.LevelNine.lesson2;

public class task2 {
    /*Написать пять методов, которые вызывают друг друга.
    Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.*/
    public static void main(String[] args) {
        method1();
    }

    private static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    private static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    private static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    private static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }

    private static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }
}
