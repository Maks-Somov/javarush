package com.company.LevelEight.lesson8;

import java.text.ParseException;
import java.util.*;

public class task4 {
    /*Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
    Удалить из словаря всех людей, родившихся летом.*/
    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> map = new HashMap<>();
        map.put("Сидров",  new Date(2000, 4,12));
        map.put("Иванов", new Date(2012, 6, 30));
        map.put("Смирнов", new Date(2019, 8, 21));
        map.put("Петров", new Date(1998, 2, 14));
        map.put("Семенов", new Date(2017, 10, 17));

        removeAllSummerPeople(map);

        for (Map.Entry me : map.entrySet()) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if(rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }
    }
}
