package com.company.level14.lesson6.task1;

public class HenFactory {
    static Hen getHen(String country){
       Hen hen = null;
       switch (country){
           case Country.BELARUS:
               hen = new BelarusianHen();
               break;
           case Country.MOLDOVA:
               hen = new MoldovanHen();
               break;
           case Country.RUSSIA:
               hen = new RussianHen();
               break;
           case Country.UKRAINE:
               hen = new UkrainianHen();
               break;
       }
       return hen;
    }
}
