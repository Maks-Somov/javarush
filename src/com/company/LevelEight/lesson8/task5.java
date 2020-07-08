package com.company.LevelEight.lesson8;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task5 {
    /*Создать словарь (Map<String, String>) занести в него десять
    записей по принципу «фамилия» - «имя». Удалить людей, имеющих одинаковые имена.*/

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }

    public static HashMap createMap() {
        HashMap map = new HashMap();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Sasha");
        map.put("Sidorov", "Ivan");
        map.put("Lermontov", "Kolya");
        map.put("Pushkin", "Olya");
        map.put("Stalonne", "Galya");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        for (Map.Entry<String, String> pair : map.entrySet()){
            String name = pair.getValue();
            removeItemFromMapByValue(map, name);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}