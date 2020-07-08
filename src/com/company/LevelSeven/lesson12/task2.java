package com.company.LevelSeven.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task2 {
    /*Ввести с клавиатуры 2 числа N и M
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        List list = new ArrayList();
        for (int i = 0; i<n; i++){
            list.add(reader.readLine());
        }
        for (int i = 0; i<m; i++) {
            String str = (String) list.get(0);
            list.remove(0);
            list.add(str);
        }
            for (int i = 0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }


