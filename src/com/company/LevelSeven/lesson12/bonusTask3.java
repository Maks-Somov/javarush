package com.company.LevelSeven.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class bonusTask3 {
    /*Задача: Программа вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.*/
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(list);

        for (int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}
