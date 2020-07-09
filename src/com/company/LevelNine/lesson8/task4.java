package com.company.LevelNine.lesson8;

import com.company.Main;

import java.io.IOException;
import java.rmi.RemoteException;

public class task4 {
    /*В методе processExceptions обработайте все checked исключения.
    Нужно вывести на экран каждое возникшее checked исключение.
    Можно использовать только один блок try.*/
    public static void main(String[] args) {
        processExeption(new task4());
    }

    public static void processExeption(task4 obj){
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }



    public void method1() throws IOException{
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException{
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException{
        throw new RemoteException();
    }
}
