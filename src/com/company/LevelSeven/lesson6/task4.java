package com.company.LevelSeven.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task4 {
    /*1. Создай список строк в методе main.
    2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
    3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.*/
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i<10; i++){
            list.add(0, reader.readLine());
        }
        for (String str : list){
            System.out.println(str);
        }
    }
}
