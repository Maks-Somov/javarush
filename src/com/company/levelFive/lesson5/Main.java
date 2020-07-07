package com.company.levelFive.lesson5;

import com.company.levelFive.lesson5.Cat;

public class Main {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Barsik", 5, 10, 15);
        Cat secondCat = new Cat("Mursik", 3, 8, 15);
        Cat thirdCat = new Cat("Matroskin", 7, 12, 13);
        System.out.println(firstCat.fight(secondCat));
        System.out.println(firstCat.fight(thirdCat));
        System.out.println(secondCat.fight(thirdCat));

    }
}
