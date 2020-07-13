package com.company.LevelTen.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class bonusTask1 {
    /*Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку),
    помещает их в HashMap и выводит на экран содержимое HashMap.*/
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> map = new HashMap<>();
        Integer integer;
        String string;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<10; i++){
            integer = Integer.parseInt(reader.readLine());
            string = reader.readLine();
            map.put(integer, string);
        }
        for(Map.Entry me : map.entrySet()){
            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}
