package com.company.LevelEight.lesson12;

import java.util.HashSet;
import java.util.Set;

public class task2 {
    /*1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки*/

    public static void main(String[] args)
    {
        Set cats = createCats();
        Set dogs = createDogs();

        Set pets = join(cats, dogs);
        printPets(pets);
        Set pets1;

        pets1 = removeCats(pets, cats);
        System.out.println("new set");
        printPets(pets1);
    }

    public static class Dog{
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog " + name;
        }
    }
    public static class Cat{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat " + name;
        }
    }

    public static Set createCats(){
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Мурка"));
        cats.add(new Cat("Мурзик"));
        cats.add(new Cat("Тоша"));
        cats.add(new Cat("Рыжик"));

        return cats;
    }

    public static Set createDogs(){
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog("Мухтар"));
        dogs.add(new Dog("Рэкс"));
        dogs.add(new Dog("Кефир"));

        return dogs;
    }

    public static Set join(Set cats, Set dogs){
        Set join = new HashSet();
        join.addAll(cats);
        join.addAll(dogs);

        return join;
    }

    public static Set removeCats(Set pets, Set cats){
        pets.removeAll(cats);

        return pets;
    }

    public static void printPets(Set pets){
        for (Object obj : pets){
            System.out.println(obj);
        }
    }
}
