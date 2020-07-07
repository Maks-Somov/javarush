package com.company.LevelSeven.lesson9;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    /*1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for, вывести результат на экран. Каждый элемент списка с новой строки.*/
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 1; i<list.size();){
            list.add(i, "именно");
            i+=2;
        }
        for (String str : list){
            System.out.println(str);
        }
    }
}
