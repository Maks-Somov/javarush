package com.company.level14.lesson6.task1;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 1000;
    }

    @Override
    String getDescription() {
        return super.getDescription()+" Моя страна - "+ BELARUS+ ". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
