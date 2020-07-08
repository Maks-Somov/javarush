package com.company.LevelEight.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task5 {
    /*Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.
Пример вывода:
Мама Мыла Раму.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] arr = str.toCharArray();
        Character.toUpperCase(arr[0]);
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == ' ' && arr[i+1]!=' '){
                arr[i+1] = Character.toUpperCase(arr[i+1]);
            }
        }
        System.out.println(arr);
    }
}
