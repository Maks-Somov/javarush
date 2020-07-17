package com.company.level13.lesson2.task10;

public class Solution {
    interface Secretary extends Person{

    }
    interface Boss extends Person, Workable{

    }

    interface Person{
        void use(Person person);
        void startToWork();
    }
    interface Workable{
        boolean wantsToGetExtraWork();
    }
    public static class CleverMan implements Boss{
        @Override
        public void use(Person person) {
        }

        @Override
        public void startToWork() {
        }

        @Override
        public boolean wantsToGetExtraWork() {
            return false;
        }
    }
    public static class SmartGirl implements Secretary{
        @Override
        public void use(Person person) {
        }

        @Override
        public void startToWork() {
        }
    }
}
