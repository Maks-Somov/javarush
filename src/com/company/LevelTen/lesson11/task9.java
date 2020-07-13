package com.company.LevelTen.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task9 {
    /*Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
     Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр –
      уникальная строка, а второй – число, сколько раз данная строка встречалась в списке. Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) не влияет на результат.*/
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<20; i++){
            list.add(reader.readLine());
        }
        Map<String, Integer> map = countWords(list);

        for (Map.Entry<String, Integer> me : map.entrySet())
        {
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }

    private static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str : list){
            hashMap.put(String.valueOf(str), 0);
        }
        for (String elem : list){
            if(hashMap.containsKey(elem)){
                int n = (int) hashMap.get(elem);
                hashMap.put(elem,n+1);
            }
        }
        return hashMap;
    }
}
