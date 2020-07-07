package com.company.levelFive.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class algorithm {
    public static void main(String[] args) throws IOException {
        System.out.println("введите число элементов:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int arr[] = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(max(arr));
    }


    public static int max(int [] a){
        Arrays.sort(a);
        return a[a.length-1];
    }
}
