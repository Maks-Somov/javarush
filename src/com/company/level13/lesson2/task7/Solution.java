package com.company.level13.lesson2.task7;

public class Solution {
    public static class StringObject implements SimpleObject<String>{

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
    interface SimpleObject<T>{
        SimpleObject<T> getInstance();
    }
}
