package com.company.level13.lesson2.task4;

public class Solution {

    public static class Screen implements Selectable, Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }

    public interface Selectable{
        void onSelect();
    }
    public interface Updatable{
        void refresh();
    }
}
