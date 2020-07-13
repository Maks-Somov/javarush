package com.company.LevelTen.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task5 {
    /*Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита). Вывести результат на экран.

    Пример вывода:
    а 5
    б 8
    в 3
    г 7
    …
    я 9*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();
        int[] abcint = new int[abcArray.length];
        abcint[0] = 0;

        ArrayList alphabet = new ArrayList();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        for (String element : list)
        {
            char[] elementArray = element.toCharArray();
            for (int i=0; i < elementArray.length;i++)
            {
                if (alphabet.indexOf(elementArray[i]) >=0)
                {
                    int b = alphabet.indexOf(elementArray[i]);
                    abcint[b] = abcint[b] + 1;
                }
            }
        }
        for (int n=0; n < abcArray.length;n++)
        {
            System.out.println(abcArray[n]+" "+abcint[n]);
        }
    }
}
