package com.company.level16.lesson3.task4;

public class Solution {
    public static void main(String[] args) {
        SpecialThread st = new SpecialThread();
        Thread thread = new Thread(st);
        thread.start();

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }

    }

    public static class SpecialThread implements Runnable{

        @Override
        public void run() {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for (StackTraceElement element : stackTraceElements)
            {
                System.out.println(element);
            }
        }
    }
}
