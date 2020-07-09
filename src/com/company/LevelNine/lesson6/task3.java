package com.company.LevelNine.lesson6;

public class task3 {
    /*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
    int[] m = new int[2];
    m[8] = 5;*/
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
