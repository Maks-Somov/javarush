package com.company.LevelEight.lesson12;

import javax.xml.soap.SAAJResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class task10 {
    /*Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month». Используйте коллекции.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
        String month = reader.readLine();
        if(map.containsKey(month)){
            System.out.println(month + " is "+ map.get(month)+" month");
        }

    }
}
