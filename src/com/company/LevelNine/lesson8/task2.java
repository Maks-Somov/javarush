package com.company.LevelNine.lesson8;

public class task2 {
    /*Есть три исключения последовательно унаследованные от Exception:
class Exception1 extends Exception
class Exception2 extends Exception1
class Exception3 extends Exception2
Есть метод, который описан так:
public static void method1() throws Exception1, Exception2, Exception3

Напиши catch, который перехватит все три Exception1, Exception2 и Exception3*/
    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception3 e3){
            System.out.println(e3);
        }catch (Exception2 e2){
            System.out.println(e2);
        }catch (Exception1 e1){
            System.out.println(e1);
        }
    }

    static class Exception1 extends Exception{}
    static class Exception2 extends Exception1{}
    static class Exception3 extends Exception2{}

    public static void method1() throws Exception1, Exception2, Exception3{
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }

}
