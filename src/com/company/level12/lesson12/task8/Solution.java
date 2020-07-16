package com.company.level12.lesson12.task8;

public class Solution {
    public static void main(String[] args) {

    }
    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Businessman, Secretary, Worker {

        public void workHard() {
        }

        public void workLazy() {
        }
    }

}
