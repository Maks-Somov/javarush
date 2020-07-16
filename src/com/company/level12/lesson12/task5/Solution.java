package com.company.level12.lesson12.task5;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Tiger()));
    }
    public static String getObjectType(Object o) {
        String result = "";
        boolean isFind = false;

        if (o instanceof Cat) {
            result = "Кот";
            isFind = true;
        }
        if (o instanceof Tiger) {
            result = "Тигр";
            isFind = true;
        }
        if (o instanceof Lion) {
            result = "Лев";
            isFind = true;
        }
        if (o instanceof Bull) {
            result = "Бык";
            isFind = true;
        }
        if (o instanceof Cow) {
            result = "Корова";
            isFind = true;
        }
        if (o instanceof Animal && !isFind) {
            result = "Животное";
        }

        return result;
    }

    public static class Cat extends Animal
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }

}
