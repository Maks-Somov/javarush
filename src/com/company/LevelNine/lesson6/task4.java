package com.company.LevelNine.lesson6;

import java.util.ArrayList;

public class task4 {
    /*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);*/
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
