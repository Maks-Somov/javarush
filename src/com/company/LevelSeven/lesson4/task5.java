package com.company.LevelSeven.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5 {
    /*1. Создать массив на 20 чисел.
    2. Ввести в него значения с клавиатуры.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
    5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/

    public static void main(String[] args) throws IOException {
        int[] arrInt = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<arrInt.length; i++){
            arrInt[i] = Integer.parseInt(reader.readLine());
        }

        int firstArr[] = new int[10];
        int secondArr[] = new int[10];

        for (int i = 0; i<firstArr.length; i++){
            firstArr[i] = arrInt[i];
        }

        for (int i = 0; i<secondArr.length; i++){
            secondArr[i] = arrInt[i+10];
            System.out.println(secondArr[i]);
        }
    }

}
