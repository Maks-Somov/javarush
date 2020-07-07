package com.company.LevelSeven.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task5 {
    /*1. Введи с клавиатуры 10 слов в список строк.
    2. Метод doubleValues должен удваивать слова по принципу a,b,c → a,a,b,b,c,c.
    3. Используя цикл for, выведи результат на экран, каждое значение с новой строки.*/
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<10; i++){
            list.add(reader.readLine());
        }
        list = doubleValue(list);
        for (String str : list){
            System.out.println(str);
        }
    }
    public static ArrayList<String> doubleValue(ArrayList<String> list){
        ArrayList<String> copyList = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            copyList.add(list.get(i));
            copyList.add(list.get(i));
        }
        return copyList;
    }
}
