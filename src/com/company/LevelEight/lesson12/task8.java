package com.company.LevelEight.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task8 {
    /*Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.*/
    public static void main(String[] args) throws IOException {
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arr);

        for (int i = arr.length-1; i>14;i--){
            System.out.println(arr[i]);
        }
    }
}
