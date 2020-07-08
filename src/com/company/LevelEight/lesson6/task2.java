package com.company.LevelEight.lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task2 {
    /*Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.*/
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list)
    {
        //напишите тут ваш код
        for (int i=0; i < 10000; i++)
        {
            list.add(i);
        }

    }

    public static void get10000(List list)
    {
        //напишите тут ваш код
        for (int n=0; n < 10000; n++)
        {
            list.get(n);
        }

    }

    public static void set10000(List list)
    {
        //напишите тут ваш код
        for (int k=0; k < 10000; k++)
        {
            list.set(k,k);
        }

    }

    public static void remove10000(List list)
    {
        //напишите тут ваш код
        for (int l=10000-1; l >=0; l--)
        {
            list.remove(l);
        }

    }
}