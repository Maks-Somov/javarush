package com.company.LevelSeven.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
    /*1. Создать массив на 10 строк.
    2. Создать массив на 10 чисел.
    3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
    4. В каждую ячейку массива чисел записать длину строки из массива строк,
    индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
    Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.*/
    public static void main(String[] args) throws IOException {
        String[] arrStr = new String[10];
        int[] arrInt = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrStr.length; i++){
            arrStr[i] = reader.readLine();
        }

        for (int i = 0; i<arrInt.length; i++){
            arrInt[i] = arrStr[i].length();
            System.out.println(arrInt[i]);
        }
    }

}
