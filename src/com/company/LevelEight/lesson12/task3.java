package com.company.LevelEight.lesson12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class task3 {
    /*1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
    2. Пусть среди этих 10 человек есть люди с одинаковыми именами и/или фамилиями.
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.*/
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Сидоров", "Миша");
        map.put("Иванов", "Гриша");
        map.put("Смирнов", "Маша");
        map.put("Иванов", "Леша");
        map.put("Сидорова", "Миша");
        map.put("Петрова", "Юля");
        map.put("Иванова", "Вика");
        map.put("Сидорова", "Катя");
        map.put("Тяпкина", "Миша");
        map.put("Тривая", "Гриша");

        for (Map.Entry me : map.entrySet()){
            System.out.println(me.getKey()+" - "+me.getValue());
        }
    }
}
