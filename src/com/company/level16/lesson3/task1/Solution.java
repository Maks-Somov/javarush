package com.company.level16.lesson3.task1;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Thread thread = new Thread(new TestThread());
        thread.start();
    }

    public static class TestThread implements Runnable{

        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
