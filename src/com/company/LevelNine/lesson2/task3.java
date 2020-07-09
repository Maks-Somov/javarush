package com.company.LevelNine.lesson2;

public class task3 {
/*Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().*/
public static void main(String[] args) {
    method1();
}

    private static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        return stackTraceElements[2].getLineNumber();
    }

    private static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        return stackTraceElements[2].getLineNumber();
    }

    private static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        return stackTraceElements[2].getLineNumber();
    }

    private static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        return stackTraceElements[2].getLineNumber();
    }

    private static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
        return stackTraceElements[2].getLineNumber();
    }
}
