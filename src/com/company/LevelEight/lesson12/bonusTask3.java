package com.company.LevelEight.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bonusTask3 {
    /*Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList();

        for (int i = 0; i<20; i++){
            list.add(reader.readLine());
        }
        Collections.sort(list);
        for (String str: list) {
            System.out.println(str);
        }
    }
}
