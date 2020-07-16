package com.company.level12.lesson12.task6;

public class Solution {
    public static void main(String[] args) {

    }
    interface Fly{
        void fly();
    }
    interface Climb{
        void climb();
    }
    interface Run{
        void run();
    }
    public static class Cat implements Run, Climb{
        @Override
        public void climb() {
        }
        @Override
        public void run() {
        }
    }
    public static class Dog implements Run{
        @Override
        public void run() {
        }
    }
    public static class Tiger implements Run, Climb{
        @Override
        public void climb() {
        }
        @Override
        public void run() {
        }}
    public static class Duck implements Fly{
        @Override
        public void fly() {

        }
    }
}
