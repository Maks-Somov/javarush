package com.company.LevelEight.lesson6;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class task4 {
    /*Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах.*/
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(new ArrayList()));
        System.out.println(getTimeMsOfGet(new LinkedList()));

    }

    public static long getTimeMsOfGet(List list) {
        insert10000(list);
        Date start = new Date();
        get10000(list);
        Date end = new Date();
        long time = start.getTime() - end.getTime();
        return Math.abs(time);
    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }
    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

    }

}
