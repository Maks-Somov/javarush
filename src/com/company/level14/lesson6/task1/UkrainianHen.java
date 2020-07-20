package com.company.level14.lesson6.task1;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 950;
    }
    @Override
    String getDescription() {
        return super.getDescription()+" Моя страна - "+UKRAINE+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
