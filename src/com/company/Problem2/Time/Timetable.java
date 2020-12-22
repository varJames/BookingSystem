package com.company.Problem2.Time;



import java.util.Objects;
import java.util.Scanner;

public class Timetable {

    //scanner for users input.
    Scanner uInput = new Scanner(System.in);

    public Week[] week = new Week[52];
    int courtNo;

    public Timetable(int passed) {
        courtNo = passed;
        for (int i = 0; i < 52; i++) {
            //Week.printWeeks(i + 1);
            week[i] = new Week(i);
        }
        //System.out.println("This is the end of Week " + 52);
    }


    /*public void printWeek(int selection) {
        Week.printWeeks(selection);
        System.out.println(timeTable[selection]);

        //scanner for users input.
        Scanner uInput = new Scanner(System.in);
        System.out.print("Please select what day you'd like to book? 1-7: ");
        int selectionDay = uInput.nextInt();
        *//*Week.printDay(timeTable[1].weekNo[1].days[1].hours[2]);*//*
    }*/


    public String printTest() {
        int counter = 1;
        for (int i = 0; i < 52; i++) {
            System.out.println("Week Number: " + (week[i].weekNo + 1));
            System.out.println(week[i]);
            counter++;
        }
        return "finished";
    }

    public void getWeek() {

    }

    /*public void bookCourt() {
        int counter = 0;

        System.out.print("You selected: " + counter + " court, How many weeks in advance to book? ");
        int selectionWeek = uInput.nextInt();
        System.out.println(timeTable[selectionWeek]);

    }*/


    @Override
    public String toString() {
        int counter = 1;
        for (int i = 0; i < 52; i++) {
            System.out.println("Week Number: " + (week[i].weekNo + 1));
            System.out.println(week[i]);
            counter++;
        }
        return "finished";
    }



    }





    //System.out.println("\t9:00\t10:00\t11:00\t12:00\t01:00\t02:00\t03:00\t04:00\t05:00");
