package com.company.LevelNine.lesson11;

import java.io.*;

public class bonusTask2 {
    /*Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то программа должна вывести надпись
 «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        if(!new File(firstFile).exists()){
            System.out.println("Файл не существует!");
            firstFile = reader.readLine();
        }
        String secondFile = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(firstFile);
        FileOutputStream fileOutputStream = new FileOutputStream(secondFile);

        int count = 0;
        while (fileInputStream.available()>0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
