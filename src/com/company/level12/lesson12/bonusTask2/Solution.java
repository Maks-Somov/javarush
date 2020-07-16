package com.company.level12.lesson12.bonusTask2;

public class Solution {
    public static interface Fly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly {
        @Override
        public void fly() {

        }
    }

}
