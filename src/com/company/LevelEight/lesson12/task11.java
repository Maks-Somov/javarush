package com.company.LevelEight.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

public class task11 {
    /*Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон

Пример вывода:
Абрамовичи*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();

        while (true){
            String family = reader.readLine();
            if(family.isEmpty()) break;
            String city = reader.readLine();
            if(city.isEmpty()) break;
            map.put(family, city);
        }
        System.out.println("Write family: ");
        String find = reader.readLine();
        if (map.containsKey(find)){
            System.out.println(map.get(find));
        }
    }
}
