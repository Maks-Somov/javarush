package com.company.LevelNine.lesson6;

import java.util.HashMap;

public class task5 {
    /*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
    HashMap<String, String> map = new HashMap<String, String>(null);
    map.put(null, null);
    map.remove(null);*/
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

    }
}
