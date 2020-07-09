package com.company.LevelNine.lesson8;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class task1 {
    /*Есть метод, который выбрасывает два исключения, унаследованные от Exception,
    и два унаследованных от RuntimeException: NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

    Нужно перехватить NullPointerException и FileNotFoundException,
    но не перехватывать ArithmeticException и URISyntaxException. Как это сделать?*/

    public static void main(String[] args) throws Exception {
        try
        {
            method();
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }

    public static void method() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
