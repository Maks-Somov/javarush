package com.company.level14.lesson8.task5;

public class Solution {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Monitor(), new Mouse());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}
