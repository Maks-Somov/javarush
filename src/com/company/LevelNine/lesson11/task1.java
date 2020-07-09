package com.company.LevelNine.lesson11;

public class task1 {
    /*Создай метод public static void divisionByZero,
    в котором подели любое число на ноль и выведи на экран результат деления.
    Оберни вызов метода divisionByZero в try..catch.
    Выведи стек-трейс исключения используя метод exception.printStackTrace()*/
    public static void main(String[] args) {
        try {
            divisionByZero();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void divisionByZero(){
        int a = 10/0;
        System.out.println(a);
    }
}
