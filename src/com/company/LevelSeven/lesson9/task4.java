package com.company.LevelSeven.lesson9;

import java.util.ArrayList;
import java.util.List;

public class task4 {
    /*1. Создай список слов, заполни его самостоятельно.
2. Метод fix() должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза*/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("лира");
        list.add("лоза");
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList fix(ArrayList<String> list)
    {
        //напишите тут ваш код
        ArrayList listcopy = new ArrayList();
        for (int i=0; i < list.size();i++)
        {
            if (list.get(i).contains("л"))
            {
                if (list.get(i).contains("р"))
                    listcopy.add(list.get(i));
                else
                {
                    listcopy.add(list.get(i));
                    listcopy.add(list.get(i));
                }
            }
            else
            {
                if (!list.get(i).contains("р"))
                    listcopy.add(list.get(i));
            }
        }
        return listcopy;
    }

}
