package com.company.level13.lesson11.task7;

public class Solution {
    public static void main(String[] args) {
        SimpleObject<String> stringObject = new StringObject();
    }

    public static class StringObject implements SimpleObject<String>{
        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }
    interface SimpleObject<T>{
        SimpleObject<T> getInstance();
    }
}
