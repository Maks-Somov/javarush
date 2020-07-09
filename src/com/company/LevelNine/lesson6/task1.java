package com.company.LevelNine.lesson6;

public class task1 {
    /*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
      int a = 42 / 0;*/
    public static void main(String[] args) {
        try {
            int a = 42/0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
