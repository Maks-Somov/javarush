package com.company.LevelNine.lesson8;

public class task5 {
    /*В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try.*/
    public static void main(String[] args) {
        processExeption(new task5());
    }

    public static void processExeption(task5 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

    }

    public void method1() throws ArithmeticException{
        throw new ArithmeticException();
    }
    public void method2() throws IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException();
    }
    public void method3() throws IllegalArgumentException{
        throw new IllegalArgumentException();
    }
}
