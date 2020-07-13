package com.company.LevelNine.lesson11;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class bonusTask3 {
    /*Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз

Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = (String[]) list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!isNumber(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (!isNumber(array[j])) {
                        String temp = array[i];
                        if (!isGreaterThan(array[i], array[j])) {
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    if (isNumber(array[j])) {
                        String temp = array[i];
                        int t1 = Integer.parseInt(array[i]);
                        int t2 = Integer.parseInt(array[j]);
                        if (t1 > t2) {
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') || (!Character.isDigit(c) && c != '-')) {
                return false;
            }
        }
        return true;
    }
}
