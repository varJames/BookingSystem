package com.company.Problem2;

import com.company.Problem2.Registered.Member;
import com.company.Problem2.Time.Timetable;

import java.util.Scanner;

public class Problem2Driver {


    public static void main(String[] args) {
//scanner for users input.
        Scanner uInput = new Scanner(System.in);

            /*Timetable test = new Timetable();


            test.bookingTimetable();

        System.out.println("how many weeks in advance do you want to book? : ");

        int selection = uInput.nextInt();
        test.printWeek(selection);*/

        System.out.println();



        System.out.print("How many courts to create: ");
        int selection = uInput.nextInt();
        Court courts = new Court(selection);

        courts.printCourt();
    }




}
