package com.company.LevelNine.lesson11;

import com.company.Main;
import com.sun.activation.registries.MailcapParseException;
import com.sun.xml.internal.ws.server.sei.SEIInvokerTube;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class task9 {
    /*Создать класс кот – Cat, с полем «имя» (String).
    Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
    Получить из Map множество(Set) всех имен и вывести его на экран.*/
    public static void main(String[] args) {
        Map<String, Cat> map = new HashMap<>();
       for (int i = 0; i<10; i++){
           String str = "Cat"+i;
           map.put(str, new Cat(str));
       }
        Set<String> set = new HashSet<>();
       for (Map.Entry<String,Cat> me : map.entrySet()){
           set.add(me.getKey());
       }
       for (String str : set){
           System.out.println(str);
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
