package com.company.LevelTen.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class bonusTask2 {
    /*Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
    Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
    Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны.
    Введенные данные не должны потеряться!
    Затем программа выводит содержание HashMap на экран

    Пример ввода:
    1
    Мама
    2
    Рама

    Пример вывода:
    1 Мама
    2 Рама*/
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (;;) {
            String string = reader.readLine();
            if (string.isEmpty()) break;
                Integer integer = Integer.parseInt(reader.readLine());
            map.put(integer, string);
        }
        for (Map.Entry me : map.entrySet()) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}
