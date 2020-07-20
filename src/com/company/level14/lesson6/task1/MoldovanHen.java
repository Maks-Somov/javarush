package com.company.level14.lesson6.task1;

public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 800;
    }
    @Override
    String getDescription() {
        return super.getDescription()+" Моя страна - "+MOLDOVA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
