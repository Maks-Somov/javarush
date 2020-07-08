package com.company.LevelEight.lesson3;

import java.util.HashMap;
import java.util.Map;

public class task4 {
    /*Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.*/
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put("sdvd", "sdfdv");
        map.put("lokit", "sdvygtr");
        map.put("76uh", "skyudv");
        map.put("ewgg5", "4yrsdv");
        map.put("olk", "sdkurv");
        map.put("solikuj", "jrrsdv");
        map.put("43456", "k8sdv");
        map.put("sukkuyy", "8ijysdv");
        map.put("sbvhy", "jrsytndv");
        map.put("sdvsg", "ursurjsyugv");

        for (Map.Entry me : map.entrySet()) {
            System.out.println(me.getKey());
        }
    }
}
