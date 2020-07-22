package com.company.level15.lesson12.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = reader.readLine();
            if (str.indexOf('?') != -1 && str.indexOf('?') + 1 < str.length()) {
                String[] params = str.substring(str.indexOf('?') + 1).trim().split("&");
                for (String s : params) {
                    if (s.indexOf('=') != -1) {
                        System.out.print(s.substring(0, s.indexOf('=')));
                        System.out.print(" ");
                    } else {
                        System.out.print(s);
                        System.out.print(" ");
                    }
                }
                System.out.println();
                for (String s : params) {
                    if (str.indexOf('=') != -1) {
                        if ("obj".equals(s.substring(0, s.indexOf('=')))) {
                            String data = s.substring(s.indexOf('=') + 1);
                            try {
                                alert(Double.parseDouble(data));
                            } catch (NumberFormatException err) {
                                alert(data);
                            }
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
