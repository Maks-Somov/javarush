package com.company.LevelNine.lesson11;

import java.util.ArrayList;
import java.util.List;

public class task8 {
    /*Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов
    длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.*/
    public static void main(String[] args) {
        List<int[]> list = new ArrayList();
        int[] a = new int[5];
        int[] b = new int[2];
        int[] c = new int[4];
        int[] d = new int[7];
        int[] e = new int[0];
        for (int i = 0; i<a.length; i++){
            a[i] = i;
        }
        for (int i = 0; i<b.length; i++){
            b[i] = i;
        }
        for (int i = 0; i<c.length; i++){
            c[i] = i;
        }
        for (int i = 0; i<d.length; i++){
            d[i] = i;
        }
        for (int i = 0; i<e.length; i++){
            e[i] = i;
        }

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        for (int[] array : list){
            for (int x : array){
                System.out.println(x);
            }
        }
    }
}
