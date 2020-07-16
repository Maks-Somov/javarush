package com.company.level12.lesson12.task9;

public class Solution {
    public static interface Businessman {
        public void workHard();
    }
    public static class CTO extends Businessmans implements Businessman {
    }
    public static class Businessmans implements Businessman {
        @Override
        public void workHard() {
        }
    }
}
