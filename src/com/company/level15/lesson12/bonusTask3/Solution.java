package com.company.level15.lesson12.bonusTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int fact = Integer.parseInt(reader.readLine());
            System.out.println(factorial(fact));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int factorial(int f){
        if (f<0) return 0;
        if (f==1 || f==0) return 1;
        return f*factorial(f-1);
    }
}
