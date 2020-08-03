package com.company.level16.lesson10.task4;

public class Solution {
    public static boolean isRun;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        isRun = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            isRun = true;
            while (isRun) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}