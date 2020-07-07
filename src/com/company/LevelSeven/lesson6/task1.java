package com.company.LevelSeven.lesson6;

import java.util.ArrayList;

public class task1 {
    /*1. Создай список строк.
    2. Добавь в него 5 различных строчек.
    3. Выведи его размер на экран.
    4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки.*/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("asf");
        list.add("wqe");
        list.add("gvbfs");
        list.add("fshf");
        list.add("fsdwawf");
        System.out.println(list.size());
        for (String str : list){
            System.out.println(str);
        }

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
