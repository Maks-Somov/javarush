package com.company.LevelNine.lesson6;

public class task2 {
    /*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
    String s = null;
    String m = s.toLowerCase();*/
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
