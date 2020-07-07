package com.company.levelFive.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String str;
        for(;;){
            str = reader.readLine();
            int a;
            if(str.equals("сумма")) break;

            a = Integer.parseInt(str);
            sum += a;
        }
        System.out.println(sum);
    }
}
