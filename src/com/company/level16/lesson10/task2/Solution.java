package com.company.level16.lesson10.task2;

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();

        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                //add your code here - добавьте код тут
            int numSeconds = 4;
            while (!Thread.interrupted()){
                Thread.sleep(1000);
                System.out.println(numSeconds);
                numSeconds--;
            }
                System.out.println("Марш!");
            } catch (InterruptedException e) {

                System.out.print("Прервано!");

            }
        }
    }
}
