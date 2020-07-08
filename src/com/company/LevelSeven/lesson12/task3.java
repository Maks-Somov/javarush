package com.company.LevelSeven.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
    /*Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.*/
    public static void main(String[] args) throws IOException {
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max = "+ max + " ; Min = "+ min);
    }
}
