package com.company.LevelSeven.lesson12;

public class task6 {
    /*Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
    Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
    Вывести объекты на экран.

    Примечание:
    Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

    Пример вывода:
    Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
    Имя: Катя, пол: женский, возраст: 55
    Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня*/
    public static void main(String[] args) {
        Human mother = new Human("Катя", false, 55, null, null);
        Human mother1 = new Human("Aня", false, 55,null, null);
        Human father = new Human("Павел", true, 57,null, null);
        Human father1 = new Human("Михаил", true, 57,null, null);

        Human son = new Human("Игорь", true, 2, father1, mother1);
        Human daughter = new Human("Аня", false, 21, father, mother);
        System.out.println(mother);
        System.out.println(mother1);
        System.out.println(father);
        System.out.println(father1);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Human{
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String text = "Имя: "+ this.name+ " Пол: "+(this.sex == true? "Мужской": "Женский")+ " Возраст:"+this.age;
            if (father!=null){
                text+=" Отец: "+this.father.name;
            }
            if (mother!=null){
                text+=" Мать: "+this.mother.name;
            }
            return text;
        }
    }
}
