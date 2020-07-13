package com.company.LevelTen.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class bonusTask3 {
    /*Задача: Ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
    Пояснение:
    Самое минимальное число – 1-е минимальное.
    Следующее минимальное после него – 2-е минимальное

    Пример:
    1 6 5 7 1 15 63 88
    Первое минимальное – 1
    Второе минимальное – 1
    Третье минимальное – 5
    Четвертое минимальное – 6*/
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<30; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        System.out.println("10-e минимальное число - " + list.get(9));
        System.out.println("11-e минимальное число - " + list.get(10));
    }
}
