package com.company.level12.lesson2.task3;

public class Solution {
    public static void main(String[] args) {

    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet{
        public Pet getChild(){
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        public Pet getChild(){
            return new Dog();
        }
    }
}
