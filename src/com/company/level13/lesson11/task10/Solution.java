package com.company.level13.lesson11.task10;

import java.awt.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        @Override
        public String getName() {
            return "BigFox";
        }

        @Override
        public Color getColor() {
            return Color.orange;
        }
    }

}
