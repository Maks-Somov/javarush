package com.company.level14.lesson6.task1;

public class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 1100;
    }
    @Override
    String getDescription() {
        return super.getDescription()+" Моя страна - "+RUSSIA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
