package com.company.LevelTen.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task10 {
    /*Создать список целых чисел. Ввести с клавиатуры 20 целых чисел.
    Создать метод по безопасному извлечению чисел из списка:
    int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)

    Метод должен возвращать элемент списка (list) по его индексу (index).
    Если в процессе получения элемента возникло исключение, его нужно перехватить,
    и метод должен вернуть defaultValue.*/

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(safeGetElement(list, 5, 10));

    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue){
        int value = 0;
        try {
            value = list.get(index);
        }catch (Exception e){
            value = defaultValue;
        }
        return value;
    }
}
