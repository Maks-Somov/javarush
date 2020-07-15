package com.company.level12.lesson9.task5;

public class Solution {
    public static void main(String[] args) {

    }
    public static abstract class Human implements Run,Swim{}

    public interface Run{
        int speed();
    }
    public interface Swim{
        int deep();
    }

}
