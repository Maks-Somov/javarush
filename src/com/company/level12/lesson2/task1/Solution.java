package com.company.level12.lesson2.task1;

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();
        cow.getName();
    }
    public static class Cow{
        public void getName(){
            System.out.println("Я корова");
        }
    }

    public static class Whale extends Cow{
        @Override
        public void getName() {
            System.out.println("Я не корова, я кит");
        }
    }
}

