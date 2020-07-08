package com.company.LevelEight.lesson8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class task2 {
/*Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.*/
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i<20; i++){
            set.add(i+(int) Math.random()*10);
        }
        Iterator n = set.iterator();
        while (n.hasNext())
        {
            int i = (int) n.next();
            if (i > 10)
                n.remove();
        }
        for (Integer in : set){
            System.out.println(in);
        }
    }
}
