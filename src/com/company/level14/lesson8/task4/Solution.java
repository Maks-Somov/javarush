package com.company.level14.lesson8.task4;

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        if (object instanceof Movable) {
            ((Movable) object).move();
        }
        if (object instanceof Drawable) {
            ((Drawable) object).draw();
        }
    }

    interface Movable {
        void move();
    }

    static class Circle implements Movable {
        public void draw() {
            System.out.println("can be drawn");
        }
        public void move() {
            System.out.println("can be moved");
        }
    }

    interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("can be drawn");
        }
        public void move() {
            System.out.println("can be moved");
        }
    }
}
