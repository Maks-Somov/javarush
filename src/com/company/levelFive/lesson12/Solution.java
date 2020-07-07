package com.company.levelFive.lesson12;

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Anton", 20, "sajmjsaf");
        Man man1 = new Man("Igor", 43, "sdvc");
        System.out.println(man + "\n" + man1);

        Woman woman = new Woman("Vika", 23, "grsfd");
        Woman woman1 = new Woman("Ania", 20, "gcsdrsfdscd");
        System.out.println(woman + "\n" + woman1);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
