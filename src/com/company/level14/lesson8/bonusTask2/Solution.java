package com.company.level14.lesson8.bonusTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(NOD(a, b));
    }

    public static int NOD(int a, int b){
        while (a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }else b = b%a;
        }
        return a+b;
    }
}
