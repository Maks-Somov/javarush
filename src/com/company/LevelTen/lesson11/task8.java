package com.company.LevelTen.lesson11;

import java.util.ArrayList;

public class task8 {
    /*Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.*/
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList();
        list[0].add("a");
        list[0].add("b");
        list[0].add("c");
        list[1] = new ArrayList();
        list[1].add("aa");
        list[1].add("bb");
        list[1].add("cc");
        list[2] = new ArrayList();
        list[2].add("aaa");
        list[2].add("bbb");
        list[2].add("ccc");

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}
