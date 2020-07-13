package com.company.LevelTen.lesson11;

public class task6 {
    /*Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.*/
    public static class Human{
        private String name;
        private String address;
        private Human father;
        private Human mother;
        private int age;
        private boolean sex;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Human(String name, String address, Human father, Human mother) {
            this.name = name;
            this.address = address;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, String address, Human father, Human mother, int age) {
            this.name = name;
            this.address = address;
            this.father = father;
            this.mother = mother;
            this.age = age;
        }

        public Human(String name, String address, Human father, Human mother, int age, boolean sex) {
            this.name = name;
            this.address = address;
            this.father = father;
            this.mother = mother;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Human(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
        public Human(String name, int age,boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, String address, int age, boolean sex) {
            this.name = name;
            this.address = address;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, Human father, Human mother, int age, boolean sex) {
            this.name = name;
            this.father = father;
            this.mother = mother;
            this.age = age;
            this.sex = sex;
        }

    }
}
