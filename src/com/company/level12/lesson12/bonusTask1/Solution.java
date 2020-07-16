package com.company.level12.lesson12.bonusTask1;

public class Solution {
    public static void main(String[] args) {
        Horse horse = new Pegas();
        horse.run();
    }

    public static interface Fly {
        //public abstract void fly();
        void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly {
        //public abstract void fly() {
        public void fly() {

        }
    }

    public static abstract class SwimPegas extends Pegas {
        public abstract void swim();
    }

}
