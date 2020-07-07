package com.company.LevelSeven.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {
    /*1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.*/
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<arrInt.length; i++){
            try {
                arrInt[i] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = arrInt.length-1; i>=0; i--){
            System.out.println(arrInt[i]);
        }
    }
}
