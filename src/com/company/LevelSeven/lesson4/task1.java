package com.company.LevelSeven.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    /*1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/

    public static void main(String[] args) {
        int[] arr = new int[20];
        try {
            initializeArray(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Максимальный элемент массива: "+maxArray(arr));
    }

    public static void initializeArray(int[] arr) throws IOException {
        System.out.println("Введите элементы массива: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
    }

    public static int maxArray(int[] arr){
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
