package com.company.level15.lesson12.bonusTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static{
        reset();
    }
    public static Flyable result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;

        try {
            str = reader.readLine();
            switch (str.toLowerCase()) {
                case "plane":
                    int count = Integer.parseInt(reader.readLine());
                    result = new Plane(count);
                    break;
                case "helicopter":
                    result = new Helicopter();
                    break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

    }
}
