package com.company.level15.lesson12.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true){
            str = reader.readLine();
            if("exit".equals(str)) break;

            try{
                if (str.contains(".")) print(Double.parseDouble(str));
                else if (Integer.parseInt(str)>0 && Integer.parseInt(str)<128) print(Short.parseShort(str));
                else if (Integer.parseInt(str)>=128) print(Integer.parseInt(str));
            }catch (NumberFormatException e){
                print(str);
            }

        }
    }
    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

}
