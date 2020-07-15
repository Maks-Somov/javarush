package com.company.level12.lesson9.task4;

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly{}
    public interface Run{}
    public interface Swim{}

    public static class Human implements Fly, Run, Swim {}
    public static class Duck implements Fly, Run, Swim {}
    public static class Penguin implements Fly, Run, Swim {}
    public static class Airplane implements Fly, Run, Swim {}
}
