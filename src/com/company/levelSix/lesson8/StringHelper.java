package com.company.levelSix.lesson8;

public class StringHelper {

    public static void main(String[] args) {
        System.out.println(multiply("Амиго"));
        System.out.println(multiply("abc", 2));
    }

    public static String multiply(String s, int count){
        String str="";
        for (int i = 0; i<count;i++){
            str+=s;
        }
        return str;
    }

    public static String multiply(String s){
        String str = "";
        for (int i = 0; i<5; i++){
            str +=s;
        }
        return str;
    }
}
