package com.company.levelSix.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

    public String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        return a;
    }

    public int readInt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        return a;
    }

    public double readDouble() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        return a;
    }

    public boolean readBoolean() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*String a = reader.readLine();
        boolean bool = false;
        if (a=="true") bool = true;
        if (a=="false") bool = false;
        return bool;*/
        boolean a = Boolean.parseBoolean(reader.readLine());
        return a;
    }
}
