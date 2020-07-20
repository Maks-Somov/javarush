package com.company.level13.lesson11.task9;

import java.awt.*;

public class Solution {
    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {

        public String getName() {
            return "Fox";
        }
    }
}
