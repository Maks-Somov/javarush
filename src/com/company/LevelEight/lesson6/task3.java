package com.company.LevelEight.lesson6;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class task3 {
    /*Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.*/
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));

    }

    public static long getTimeMsOfInsert(List list) {
        Date start = new Date();
        insert10000(list);
        Date end = new Date();
        long time = start.getTime() - end.getTime();
        return Math.abs(time);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

    }

}
