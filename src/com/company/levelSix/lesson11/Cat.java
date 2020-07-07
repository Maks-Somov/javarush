package com.company.levelSix.lesson11;

import java.util.ArrayList;

public class Cat {

    private String name;
    private Cat father;
    private Cat mother;


    public static int catCount = 0;
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, Cat father, Cat mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
        catCount++;
        cats.add(this);
    }

    public static void printCats(){
        for (Cat cat : cats){
        System.out.println(cats);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getFather() {
        return father;
    }

    public void setFather(Cat father) {
        this.father = father;
    }

    public Cat getMother() {
        return mother;
    }

    public void setMother(Cat mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        String nameFather;
        String nameMother;

        if(father == null){
            nameFather = "no father";
        }else{
            nameFather = father.getName();
        }
        if (mother == null){
            nameMother = "mo mather";
        }else{
            nameMother = mother.getName();
        }

        return "Cat name is "+ name+", "+nameFather+", "+ nameMother;
    }
}
