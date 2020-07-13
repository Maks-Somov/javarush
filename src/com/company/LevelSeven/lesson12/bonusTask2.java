package com.company.LevelSeven.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class bonusTask2 {
    /*Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
    Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
    Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
    Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается. Программа выводит содержимое нового списка на экран.

    Пример ввода:
    Кот
    Коты
    Я
    Пример вывода:
    Кот Кот Кот
    Коты Коты
    Я Я Я*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        while (true){
            String str = reader.readLine();
            if(str.isEmpty()) break;
            list.add(str);
        }

        ArrayList newList = new ArrayList();

        for (int i = 0; i<list.size(); i++){
            String str = (String) list.get(i);
//            str = str.toUpperCase();
            if(str.length()%2==0){
                newList.add(str + " " + str);
            }else{
                newList.add(str + " " + str+ " "+str);
            }
        }
        for (Object str : newList){
            System.out.println(str);
        }

    }
}
