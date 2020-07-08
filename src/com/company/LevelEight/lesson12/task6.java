package com.company.LevelEight.lesson12;

import java.util.ArrayList;

public class task6 {
    /*1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.*/
    public static void main(String[] args) {
    }

    public static class Human{
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
    }
}
