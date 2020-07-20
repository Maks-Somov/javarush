package com.company.level13.lesson11.task3;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();//D:\javarush\src\com\company\level13\lesson11\task3\file.txt
        InputStream inputStream = null;
        try
        {
            inputStream = new FileInputStream(name);

            while (inputStream.available() > 0) {
                System.out.print((char)inputStream.read());
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally
        {
            if (inputStream != null)
                inputStream.close();
            reader.close();
        }

    }
}
