package com.company.level13.lesson6.task1;

public class Solution {
    public static void main(String[] args) {

    }

    public static class Dog implements Move, EatSb{
        @Override
        public void speed() {

        }
        @Override
        public void food(Object o) {

        }
    }
    public static class Cat implements Move, EatSb, BeEaten{
        @Override
        public void speed() {

        }
        @Override
        public void food(Object o) {

        }
        @Override
        public void whoEat(Object o) {

        }
    }
    public static class Mouse implements Move, BeEaten{
        @Override
        public void speed() {

        }
        @Override
        public void whoEat(Object o) {

        }
    }

    interface Move{
        void speed();
    }
    interface EatSb{
        void food(Object o);
    }
    interface BeEaten{
        void whoEat(Object o);
    }
}
