package com.company.levelFive.lesson5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cat {
    String name;
    int age;
    int weight;
    int strength;

    public boolean fight(Cat anotherCat){
        int firstCat = 50*this.strength + 30*this.weight + 20*this.age;
        int secondCat = 50*anotherCat.strength + 30*anotherCat.weight + 20*anotherCat.age;

        return firstCat>secondCat;
    }
}
