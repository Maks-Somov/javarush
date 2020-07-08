package com.company.LevelEight.lesson3;

import javax.sql.rowset.serial.SerialStruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class task3 {
    /*Есть класс Cat, с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.*/
    public static void main(String[] args) throws IOException {
        HashMap<String,Cat> map = new HashMap<>();
        String[] catsName = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<catsName.length; i++){
            catsName[i] = reader.readLine();
        }
        map = arrToHashMap(catsName);
        for (Map.Entry me: map.entrySet()){
            System.out.println(me.getKey()+" - "+me.getValue());
        }


    }

    public static HashMap arrToHashMap(String [] catsName){
        HashMap map = new HashMap();
        for (int i = 0; i<catsName.length; i++){
            map.put(catsName[i], new Cat(catsName[i]));
        }
        return map;
    }

    public static class Cat{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return
                    "name = " + name ;
        }
    }
}
