package com.company.LevelSeven.lesson12;

import java.util.ArrayList;

public class task5 {
    /*Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!».
     Программа должна уменьшать число 10 раз в секунду.
     Для того чтобы вставить в программу задержку, воспользуйся функцией:
     Thread.sleep(100); //задержка на одну десятую секунды.

Пример:
30
29
…
1
0
Бум!*/
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 30; i>=0; i--){
            list.add(i);
        }
        for (int i : list){
            Thread.sleep(100);
            System.out.println(i);
        }
        System.out.println("Бум!");
    }
}
