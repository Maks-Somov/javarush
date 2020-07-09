package com.company.LevelNine.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5 {
    /*Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1) первая строка содержит только гласные буквы
2) вторая - только согласные буквы и знаки препинания из введённой строки.
Символы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String str1, str2;
        str1="";
        str2="";
        char[] chars = str.toCharArray();
        for (int i = 0; i<chars.length; i++){
            if(isVowel(chars[i]))
                str1 = str1 + chars[i] +" ";
            else {
                if (chars[i] !=' ')
                    str2 = str2 + chars[i] + " ";
            }
        }
        System.out.println(str1);
        System.out.println(str2);
        }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

     public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);
        for (char d : vowels) {
            if (c == d)
                return true;
    }
        return false;
}
}
