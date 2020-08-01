package com.company.level16.lesson3.task2;

public class Solution {

    public static void main(String[] args) {
        TestThread tt = new TestThread();
        tt.start();
    }


    public static class TestThread extends Thread{
        static{
            System.out.println("it's static block inside TestThread");
        }
        @Override
        public void run() {
            System.out.println("it's run method");
        }
    }
}
