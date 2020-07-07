package com.company.levelSix.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/*

        String grandFatherN = reader.readLine();
        String grandMotherN = reader.readLine();
        String fatherN = reader.readLine();
        String motherN = reader.readLine();
        String sonN = reader.readLine();
        String daughterN = reader.readLine();

        Cat grandFather = new Cat("Вася");
        Cat grandMother = new Cat("Мурка");
        Cat father = new Cat("Котофей");
        Cat mother = new Cat("Василиса");
        Cat son = new Cat("Мурчик");
        Cat daughter = new Cat("Пушинка");

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
*/
        int arr[] = new int[5];
        for (int i = 0; i<5; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }


        /*int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Max is " + max(a,b));*/
    }

    public static int max(int a, int b){
        return a>b ? a:b;
    }

    public static class Idea{
        public String getDescription(){
            return "adf";
        }
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }

}
