package com.company.LevelSeven.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task3 {
    /*1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую короткую строку в списке.
    4. Выведи найденную строку на экран.
    5. Если таких строк несколько, выведи каждую с новой строки.*/

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<5; i++){
            list.add(reader.readLine());
        }

        int min = list.get(0).length();
        for(int i = 0; i<list.size(); i++){
            if(min>list.get(i).length()){
                min = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++){
            if(min == list.get(i).length()){
                System.out.println(list.get(i));
            }
        }
    }
}
