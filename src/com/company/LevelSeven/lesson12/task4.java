package com.company.LevelSeven.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task4 {
    /*Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку “end”. “end” не учитывать.
Вывести строки на экран, каждую с новой строки.*/
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (; ; ) {
            String str = reader.readLine();
            if (str.equals("end")) {
                break;
            } else {
                list.add(str);
            }
        }
        for (String str : list){
            System.out.println(str);
        }

    }
}
