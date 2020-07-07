package com.company.LevelSeven.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task1 {
    /*1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
    2. Метод printList должен выводить на экран все элементы списка с новой строки.
    3. Используя метод printList, выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.*/
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        List<Integer> divideInto3 = new ArrayList<>();
        List<Integer> divideInto2 = new ArrayList<>();
        List<Integer> other = new ArrayList<>();

        for (int i = 0; i<list.size(); i++){
            int x = list.get(i);

            if(x%3==0){
                divideInto3.add(x);
            }
            if(x%2==0){
                divideInto2.add(x);
            }
            if(x%3!=0 && x%2!=0){
                other.add(x);
            }
        }
        printList(divideInto3);
        printList(divideInto2);
        printList(other);
    }
    public static void printList(List list){
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
