package com.company.LevelNine.lesson11;

import java.util.ArrayList;

public class task6 {
    /*1. Есть пять классов: красная шапочка, бабушка, пирожок, дровосек, волк.
    2. У каждого класса есть 2 поля: убил (killed ArrayList) и съел (ate ArrayList).
    3. Необходимые объекты созданы (hood, grandmother, ...).
    4. Расставь правильно связи, кто кого съел и убил, чтобы получилась логика сказки «Красная Шапочка».*/
    public static RedHat hat = new RedHat();
    public static Grandmother grandmother = new Grandmother();
    public static Pie pie = new Pie();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(hat);
        wolf.ate.add(grandmother);
        woodman.killed.add(wolf);
    }

    public static class RedHat extends StoryItem{
    }
    public static class Grandmother extends StoryItem{
    }
    public static class Pie extends StoryItem{
    }
    public static class Woodman extends StoryItem{
    }
    public static class Wolf extends StoryItem{
    }

    public static abstract class StoryItem {
        public ArrayList killed = new ArrayList();
        public ArrayList ate = new ArrayList();
    }

}
