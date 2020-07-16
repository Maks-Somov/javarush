package com.company.level12.lesson12.task4;

public class Solution {
    public static void main(String[] args) {
        System.out.println(method(new Lion()));
    }
    public static class Cat{}
    public static class Tiger{}
    public static class Lion{}
    public static class Bool{}

    public static String method(Object o){
        if(o instanceof Cat){
            return "Cat";
        }
        else if(o instanceof Tiger){
            return "Tiger";
        }
        else if(o instanceof Lion){
            return "Lion";
        }
        else if(o instanceof Bool){
            return "Bool";
        }else return "X3";
    }
}
