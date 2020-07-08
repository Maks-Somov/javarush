package com.company.LevelEight.lesson12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class task1 {
    /*1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него три кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.*/
    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet<>();
        cats = createCats();
        Iterator iterator = cats.iterator();

        cats.remove(iterator.next());
        printCats(cats);
    }
    public static void printCats(HashSet<Cat> set){
        for (Cat cat : set) {
            System.out.println(set);
        }
    }

    public static class Cat{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static HashSet createCats(){
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat("Вася"));
        cats.add(new Cat("Мурка"));
        cats.add(new Cat("Мурзик"));
        return cats;
    }


}
