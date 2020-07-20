package com.company.level13.lesson11.task4;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String lnSP = System.getProperty("line.separator");
        String str = "";

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            writer = new BufferedWriter(new FileWriter(fileName));
            while (!"exit".equals(str.toLowerCase())) {
                str = reader.readLine();
                writer.write(str + lnSP);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
