package com.company.level13.lesson2.task8;

public class Solution {
    interface Person{
        boolean isAlive();
    }
    interface Presidentable extends Person{
        @Override
        boolean isAlive();
    }
}
