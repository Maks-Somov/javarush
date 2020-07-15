package com.company.level12.lesson9.task3;

public class Solution {
    public static void main(String[] args) {

    }
    public interface Fly{}
    public interface Move{}
    public interface Eat{}

    public static class Human implements Fly, Move, Eat{}
    public static class Duck implements Fly, Move, Eat{}
    public static class Penguin implements Fly, Move, Eat{}
    public static class Airplane implements Fly, Move, Eat{}
}
