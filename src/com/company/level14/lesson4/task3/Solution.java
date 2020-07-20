package com.company.level14.lesson4.task3;

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;
        foodMethods(food);
        selectableMethods(selectable);
    }

    static void foodMethods(Food food){
        food.eat();
        food.onSelect();
    }
    static void selectableMethods(Selectable selectable){
        selectable.onSelect();
    }

    static class Food implements Selectable{
        public void eat(){
            System.out.println("food was eaten");
        }


        @Override
        public void onSelect() {
            System.out.println("food is selected");
        }
    }

    interface Selectable{
        void onSelect();
    }
}
