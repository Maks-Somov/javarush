package com.company.level16.lesson13.task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;



public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        Scanner scan = new Scanner(System.in);
        try {
            firstFileName = scan.nextLine();
        } catch (Exception e){
        }
        try {
            secondFileName = scan.nextLine();
        } catch (Exception e){
        }
        scan.close();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //(add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent();
        void join() throws InterruptedException;
        void start();
    }
    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String fileName;
        private String fileContent="";

        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }
        @Override
        public String getFileContent() {
            return fileContent;
        }
        @Override
        public void run()  {
            StringBuffer strBuffer = new StringBuffer();
            try {
                File file = new File(fileName);
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();

                if (line != null) {
                    strBuffer.append(line);
                    line = reader.readLine();
                    while (line != null) {
                        strBuffer.append(" ");
                        strBuffer.append(line);
                        line = reader.readLine();
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            fileContent = strBuffer.toString();
        }
    }
}