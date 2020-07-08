package com.company.LevelEight.lesson8;

import java.util.HashSet;
import java.util.Set;

public class task1 {
    /*Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».*/
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i <20; i++){
            set.add("Л"+i);
        }
        for (String set1 : set){
            System.out.println(set1);
        }
    }
}
