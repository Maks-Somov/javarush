package com.company.level14.lesson8.task3;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        boolean stop = false;

        while (true) {
            String str = reader.readLine();
            switch (str.toLowerCase()) {
                case "user":
                    person = new Person.User();
                    break;
                case "looser":
                    person = new Person.Loser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "proger":
                    person = new Person.Proger();
                    break;
                default:
                    stop = true;
                    System.exit(0);
            }
            if (stop = true) {
                doWork(person);
            }


        }
    }

    static void doWork(Person person) {
        if(person instanceof Person.User){
            ((Person.User) person).live();
        }
        if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }
        if(person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        if(person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
