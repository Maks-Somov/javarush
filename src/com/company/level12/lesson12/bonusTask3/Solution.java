package com.company.level12.lesson12.bonusTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
minElemAndIndex(arr);
    }

    public static void minElemAndIndex(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Min = "+min+" and index = "+index);
    }

}
