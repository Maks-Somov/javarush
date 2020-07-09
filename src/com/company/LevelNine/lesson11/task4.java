package com.company.LevelNine.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class task4 {
    /*Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Date date = new Date(reader.readLine());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, y", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }

}
