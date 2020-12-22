package com.company.Problem2.Time;

import java.util.Arrays;
import java.util.Scanner;

public class Week {


    public Days[] day = new Days[7];

    public int weekNo;

    public Week(int weekValue) {
        weekNo = weekValue;
            for (int j = 0; j < 7; j++) {
                    day[j] = new Days(j);
                    //week[j].printDays();
            }
        //System.out.println("No more time slots for: Sun");
    }

    public static void printWeeks(int weekNo) {
        System.out.println("This is start of Week " + weekNo);
    }

    public void printDay(int selection) {
        System.out.println(day[1]);
    }
    /*public void printWeek(int selection) {
        Arrays.toString(week[1][selection]);
        Week.printWeeks(selection);
    }*/





    @Override
    public String toString() {
        return Arrays.toString(day);
    }

}




