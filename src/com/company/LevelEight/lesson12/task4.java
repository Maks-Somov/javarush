package com.company.LevelEight.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task4 {
    /*1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List list = getIntegerList(N);
        System.out.println(getMinimum(list));
    }

    public static List getIntegerList(int N) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List list = new ArrayList();
        for (int i = 0; i<N; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
    public static int getMinimum(List list){
        int min = (int) list.get(0);
        for (int i = 0; i<list.size();i++){
            if(min > (int) list.get(i)){
                min = (int) list.get(i);
            }
        }
        return min;
    }
}
