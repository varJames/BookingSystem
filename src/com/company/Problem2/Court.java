package com.company.Problem2;


import com.company.Problem2.Time.Days;
import com.company.Problem2.Time.Hours;
import com.company.Problem2.Time.Timetable;
import com.company.Problem2.Time.Week;

import java.lang.reflect.Array;
import java.sql.Time;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Court {

    Scanner uInput = new Scanner(System.in);

    public static Timetable[] court = new Timetable[1000];

    public Court(int noOfCourts) {
        for (int i = 0; i < noOfCourts; i++) {
            court[i] = new Timetable(i);
        }
    }

    public static void printCourt() {
        int counter = 0;
        for (int i = 0; i < court.length; i++) {
            if (Objects.nonNull(court[i])) {
                counter++;
            } else {

            }
        }
    }



    public void bookCourt() {
        int counter = court.length;
        for (int i = 0; i < court.length; i++) {
            if (Objects.nonNull(court[i])) {
                counter++;
            } else {

            }
        }
        System.out.print("Currently there are: " + counter + " active courts, Please select what court you'd like to book by court no: ");
        int selection = uInput.nextInt();
        var thisCourt= court[selection - 1];

        System.out.print("Please select how many weeks ahead you'd like to book: ");
        int selectionWeek = uInput.nextInt();
       /* Timetable.printWeek(selectionWeek);*/
       /*var test = court[1].timeTable[1].week[3].days[1].hours[2];*/
    }

    /*public void testPrintAll() {
        System.out.println(court[1].timeTable[1].week[1].day[1].setBookedById();
    }*/

    /*@Override
    public void printTest() {
        for (int i = 0; i < court.length; i++) {
            System.out.println(court[i]);
        }
    }*/


   /* public String toString() {
        for (int i = 0; i < court.length; i++) {
            System.out.println(court[i]);
        }
        return "Court{" +
                "timeTable=" + Arrays.toString(court) +
                '}';
    }*/

        //System.out.println("\t9:00\t10:00\t11:00\t12:00\t01:00\t02:00\t03:00\t04:00\t05:00");
}

