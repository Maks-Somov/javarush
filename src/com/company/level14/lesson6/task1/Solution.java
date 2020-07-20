package com.company.level14.lesson6.task1;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen.getDescription());
    }
}
