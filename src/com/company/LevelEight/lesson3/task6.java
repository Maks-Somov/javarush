package com.company.LevelEight.lesson3;

import java.util.HashMap;
import java.util.Map;

public class task6 {
    /*Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.

    Пример вывода (тут показана только одна строка):
    Sim - 5*/
    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap();

        map.put("sdvd", 213);
        map.put("lokit", 5436.3);
        map.put("76uh", "skyu");
        map.put("ewgg5", new Cat("sdvc"));
        map.put("olk", new Long(21453));
        map.put("solikuj", new Double(353.6543));
        map.put("43456", "k8sdv");
        map.put("sukkuyy", null);
        map.put("sbvhy", "jrsytndv");
        map.put("sdvsg", new Character('d'));

        for (Map.Entry me : map.entrySet()) {
            System.out.println(me.getKey()+" - " +me.getValue());
        }
    }
    public static class Cat{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
