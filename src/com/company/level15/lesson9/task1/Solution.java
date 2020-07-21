package com.company.level15.lesson9.task1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "1.0");
        labels.put(2.0, "2.0");
        labels.put(3.0, "3.0");
        labels.put(4.0, "4.0");
        labels.put(5.0, "5.0");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
