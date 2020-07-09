package com.company.LevelNine.lesson2;

public class task5 {
    /*Написать метод, который возвращает результат – глубину его стек трейса – количество
    методов в нем (количество элементов в списке).
    Это же число метод должен выводить на экран.*/

    public static void main(String[] args) {
      deepStackTrace();
    }

    private static int deepStackTrace() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements.length);
        return stackTraceElements.length;
    }
}
